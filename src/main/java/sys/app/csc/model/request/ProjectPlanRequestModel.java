package sys.app.csc.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectPlanRequestModel {
	
	@JsonProperty("plan_name")
	private String projectplanname;	
	
	@JsonProperty("plan_description")
	private String projectplandesc;	
}
