package sys.app.csc.service.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sys.app.csc.entity.ProjectPlanEntity;
import sys.app.csc.model.dto.ProjectPlanDto;
import sys.app.csc.repository.ProjectPlanRepository;
import sys.app.csc.service.ProjectPlanService;

@Service
@AllArgsConstructor
public class ProjectPlanServiceImplementation implements ProjectPlanService {
	
	private ProjectPlanRepository repo;
	
	@Override
	public ProjectPlanDto save(ProjectPlanDto dto) {
		ModelMapper mapper = new ModelMapper();
		ProjectPlanEntity savedto = repo.save(mapper.map(dto, ProjectPlanEntity.class));
		return mapper.map(savedto, ProjectPlanDto.class);
	}

}
