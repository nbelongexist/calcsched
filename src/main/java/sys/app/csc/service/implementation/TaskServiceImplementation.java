package sys.app.csc.service.implementation;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sys.app.csc.entity.TaskEntity;
import sys.app.csc.helper.CustomMethods;
import sys.app.csc.model.dto.TaskDto;
import sys.app.csc.repository.ProjectPlanRepository;
import sys.app.csc.repository.TaskRepository;
import sys.app.csc.service.TaskService;

@Service
@AllArgsConstructor
public class TaskServiceImplementation implements TaskService {

	private TaskRepository repo;
	private ProjectPlanRepository pprepo;
	private CustomMethods helper;

	@Override
	public TaskDto save(TaskDto dto, Integer planid) {
		ProjectPlanEntity pp = pprepo.findById(planid).orElse(new ProjectPlanEntity());
		dto.setTaskstatus("Created");
		TaskEntity savedto = repo.save(helper.mapObj(dto, TaskEntity.class));
		return helper.mapObj(savedto, TaskDto.class);
	}
}
