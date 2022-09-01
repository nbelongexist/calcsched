package sys.app.csc.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequestModel {
	
	@JsonProperty("task_name")
	private String taskname;
	
	@JsonProperty("task_description")
	private String taskdesc;
	
	@JsonProperty("task_duration")
	private String taskduration;
	
	@JsonProperty("task_order")
	private String taskorder;
	
	@JsonProperty("plan_id")
	private Integer planid;

}
