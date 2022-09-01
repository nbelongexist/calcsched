package sys.app.csc.service;

import sys.app.csc.model.dto.ProjectPlanDto;

public interface ProjectPlanService {
	ProjectPlanDto save(ProjectPlanDto dto);
	ProjectPlanDto generate(Integer planid);
	ProjectPlanDto viewById(Integer planid);
}
