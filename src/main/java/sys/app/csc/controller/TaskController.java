package sys.app.csc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sys.app.csc.helper.CustomMethods;
import sys.app.csc.model.dto.TaskDto;
import sys.app.csc.model.request.TaskRequestModel;
import sys.app.csc.model.response.TaskResponseModel;
import sys.app.csc.service.TaskService;

@RestController
@AllArgsConstructor
@RequestMapping("/task")
public class TaskController {
	
	private TaskService serv;
	private CustomMethods helper;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public TaskResponseModel save(@RequestBody TaskRequestModel request) {
		
		TaskDto dto = helper.mapObj(request, TaskDto.class);
		TaskDto savedto = serv.save(dto, request.getPlanid());

		return helper.mapObj(savedto, TaskResponseModel.class);
	};

}
