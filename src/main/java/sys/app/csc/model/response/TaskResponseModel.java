package sys.app.csc.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponseModel {
	
	@JsonProperty("id")
	private Integer id;	
	
	@JsonProperty("task_name")
	private String taskname;	
	
	@JsonProperty("task_description")
	private String taskdesc;
}
