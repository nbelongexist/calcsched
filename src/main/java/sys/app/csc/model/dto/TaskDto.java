package sys.app.csc.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class TaskDto {
	
	private Integer id;
	private String taskname;
	private String taskdesc;
	private ProjectPlanDto projectplan;

}
