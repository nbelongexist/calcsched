package sys.app.csc.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectPlanResponseModel {
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("project_plan_name")
	private String projectplanname;
	
	@JsonProperty("project_plan_description")
	private String projectplandesc;

}
