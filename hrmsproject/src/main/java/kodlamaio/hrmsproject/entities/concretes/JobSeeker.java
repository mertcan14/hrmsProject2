package kodlamaio.hrmsproject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "tc_no")
	private String tcNo;
	
	@Column(name = "birth_year")
	private String birthYear;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<JobSeekerEducation> jobSeekerEducation;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<JobSeekerExperience> jobSeekerExperience;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<JobSeekerLanguage> jobSeekerLanguage;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<JobSeekerLink> jobSeekerLink;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<JobSeekerKnowledge> jobSeekerKnowledge;
	
	@OneToOne(mappedBy = "jobSeeker")
	@JsonIgnore
	private JobSeekerImage jobSeekerImage;
	
	@OneToOne(mappedBy = "jobSeeker")
	@JsonIgnore
	private JobSeekerDescription jobSeekerDescription;

	public JobSeeker(String email, String password, String firstName, String lastName, String tcNo, String birthYear,
			List<JobSeekerEducation> jobSeekerEducation, List<JobSeekerExperience> jobSeekerExperience,
			List<JobSeekerLanguage> jobSeekerLanguage, List<JobSeekerLink> jobSeekerLink,
			List<JobSeekerKnowledge> jobSeekerKnowledge, JobSeekerImage jobSeekerImage,
			JobSeekerDescription jobSeekerDescription) {
		super(email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
		this.jobSeekerEducation = jobSeekerEducation;
		this.jobSeekerExperience = jobSeekerExperience;
		this.jobSeekerLanguage = jobSeekerLanguage;
		this.jobSeekerLink = jobSeekerLink;
		this.jobSeekerKnowledge = jobSeekerKnowledge;
		this.jobSeekerImage = jobSeekerImage;
		this.jobSeekerDescription = jobSeekerDescription;
	}


}
