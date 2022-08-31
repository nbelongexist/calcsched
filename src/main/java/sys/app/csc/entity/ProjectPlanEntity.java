package sys.app.csc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="project_plan")
public class ProjectPlanEntity implements Serializable {
	
	private static final long serialVersionUID = 8949359361164339103L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer id;
	
	@Column(name="plan_name")
	private String projectplanname;
	
	@Column(name="plan_description")
	private String projectplandesc;
	
	
	@Column(name="plan_status")
	private String projectplanstatus;
	
	@JsonManagedReference
	@OneToMany(mappedBy="projectplan", cascade = CascadeType.ALL)
	private List<TaskEntity> tasklist;
}
