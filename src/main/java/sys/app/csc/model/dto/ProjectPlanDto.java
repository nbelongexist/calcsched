package sys.app.csc.model.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProjectPlanDto {	

	private Integer id;	
	private String projectplanname;	
	private String projectplandesc;	
	private String projectplanstatus;
	private List<TaskDto> tasklist;
}
