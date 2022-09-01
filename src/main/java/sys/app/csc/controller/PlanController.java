package sys.app.csc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sys.app.csc.helper.CustomMethods;
import sys.app.csc.model.dto.ProjectPlanDto;
import sys.app.csc.model.request.ProjectPlanRequestModel;
import sys.app.csc.model.response.ProjectPlanResponseModel;
import sys.app.csc.service.ProjectPlanService;

@RestController
@AllArgsConstructor
@RequestMapping("/plan")
public class PlanController {
	
	private ProjectPlanService serv;
	private CustomMethods helper;
	
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ProjectPlanResponseModel save(@RequestBody ProjectPlanRequestModel request) {
		
		ProjectPlanDto dto = helper.mapObj(request, ProjectPlanDto.class);
		ProjectPlanDto savedto = serv.save(dto);

		return helper.mapObj(savedto, ProjectPlanResponseModel.class);
	};

}
