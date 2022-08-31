package sys.app.csc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tasks")
public class TaskEntity implements Serializable {
	
	private static final long serialVersionUID = 8959973004968845661L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="task_name")
	private String taskname;
	
	@Column(name="task_description")
	private String taskdesc;
	
	@Column(name="task_status")
	private String taskstatus;
	
	@Column(name="task_duration")
	private String taskduration;
	
	@Column(name="task_start")
	private String startdate;
	
	@Column(name="task_end")
	private String enddate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="project_plan_id")
	private ProjectPlanEntity projectplan;
}
