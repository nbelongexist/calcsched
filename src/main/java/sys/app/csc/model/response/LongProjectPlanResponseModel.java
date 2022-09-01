package sys.app.csc.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LongProjectPlanResponseModel {
		
		@JsonProperty("id")
		private Integer id;
		
		@JsonProperty("plan_name")
		private String projectplanname;
		
		@JsonProperty("plan_description")
		private String projectplandesc;		
		
		@JsonProperty("plan_status")
		private String projectstatus;	
		
		@JsonProperty("task_list")
		private List<ShortTaskResponseModel> tasklist;

}
