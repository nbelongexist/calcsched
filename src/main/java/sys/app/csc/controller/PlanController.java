package sys.app.csc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import sys.app.csc.helper.CustomMethods;
import sys.app.csc.model.dto.ProjectPlanDto;
import sys.app.csc.model.request.ProjectPlanRequestModel;
import sys.app.csc.model.response.LongProjectPlanResponseModel;
import sys.app.csc.model.response.ProjectPlanResponseModel;
import sys.app.csc.service.ProjectPlanService;

@Tag(name = "Project Plan", description="Plan Service API")
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
	
	@GetMapping(path="/{planid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public LongProjectPlanResponseModel viewById(@PathVariable Integer planid) {
		
		ProjectPlanDto dto = serv.viewById(planid);
		
		return helper.mapObj(dto, LongProjectPlanResponseModel.class);
	};
	
	@PostMapping(path="/generate/{planid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public LongProjectPlanResponseModel generate(@PathVariable Integer planid) {
		
		ProjectPlanDto dto = serv.generate(planid);
		
		return helper.mapObj(dto, LongProjectPlanResponseModel.class);
	};

}
