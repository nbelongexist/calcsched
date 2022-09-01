package sys.app.csc.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ShortTaskResponseModel {
	@JsonProperty("id")
	private Integer id;	
	
	@JsonProperty("task_name")
	private String taskname;	
	
	@JsonProperty("task_description")
	private String taskdesc;	
	
	@JsonProperty("task_status")
	private String taskstatus;	
	
	@JsonProperty("task_duration")
	private Integer taskduration;	
	
	@JsonProperty("task_start")
	private String startdate;	
	
	@JsonProperty("task_end")
	private String enddate;	
	
	@JsonProperty("task_order")
	private Integer taskorder;
}
