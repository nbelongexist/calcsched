package sys.app.csc.service.implementation;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sys.app.csc.entity.ProjectPlanEntity;
import sys.app.csc.entity.TaskEntity;
import sys.app.csc.helper.CustomMethods;
import sys.app.csc.model.dto.ProjectPlanDto;
import sys.app.csc.repository.ProjectPlanRepository;
import sys.app.csc.repository.TaskRepository;
import sys.app.csc.service.ProjectPlanService;

@Service
@AllArgsConstructor
public class ProjectPlanServiceImplementation implements ProjectPlanService {

	private ProjectPlanRepository repo;
	private TaskRepository trepo;
	private CustomMethods helper;

	@Override
	public ProjectPlanDto save(ProjectPlanDto dto) {
		ProjectPlanEntity entity = helper.mapObj(dto, ProjectPlanEntity.class);
		entity.setProjectplanstatus("Created");
		ProjectPlanEntity savedto = repo.save(entity);
		return helper.mapObj(savedto, ProjectPlanDto.class);
	}

	@Override
	public ProjectPlanDto generate(Integer planid) {
		ProjectPlanEntity pp = repo.findById(planid).orElse(null);
		List<TaskEntity> tlist = pp.getTasklist();

		LocalDateTime now = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startdate = "";
		String enddate = "";
		Integer ordernull = 0;
		for (TaskEntity task : tlist) {
			if(task.getEnddate()!=""||task.getEnddate()!=null) {
				ordernull = ordernull+1;
			}
		}
		//System.out.println("Order: " + ordernull);
		//System.out.println("List : " + tlist.size());
		for (TaskEntity task : tlist) {

			if (task.getTaskorder() == 1) {
				startdate = sdf.format(timestamp);
			} else {
				if(task.getTaskorder() == ordernull) {
					startdate = tlist.get(ordernull-2).getEnddate();
					//System.out.println("StartDate : " + startdate);
				}
				else {
				startdate = enddate;
				}

			}
			
			
			enddate = helper.getEndDate(startdate, task.getTaskduration());
			task.setStartdate(startdate);
			task.setEnddate(enddate);
			trepo.save(task);
			//System.out.println("StartDate: " + startdate + " ||" + task.getTaskduration());

		}
		ProjectPlanEntity pp1 = repo.findById(planid).orElse(null);

		return helper.mapObj(pp1, ProjectPlanDto.class);
	}

	@Override
	public ProjectPlanDto viewById(Integer planid) {
		ProjectPlanEntity pp = repo.findById(planid).orElse(null);
		return helper.mapObj(pp, ProjectPlanDto.class);
	}

}
