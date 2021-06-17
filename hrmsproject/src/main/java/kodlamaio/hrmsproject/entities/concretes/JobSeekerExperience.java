package kodlamaio.hrmsproject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seeker_experiences")
public class JobSeekerExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	@NotNull
	@NotBlank
	private String companyName;
	
	@Column(name = "departman")
	@NotBlank
	@NotNull
	private String departman;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private int startDate;
	
	@Column(name = "end_date")
	private int endDate;
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
}
