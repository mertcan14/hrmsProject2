package kodlamaio.hrmsproject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seeker_educations")
public class JobSeekerEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	
	@Column(name = "school_name")
	@NotNull
	@NotBlank
	private String schoolName;
	
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
