package kodlamaio.hrmsproject.entities.dtos;

import java.util.List;

import kodlamaio.hrmsproject.entities.concretes.JobSeeker;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerEducation;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerExperience;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerImage;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLanguage;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCv {

	private JobSeeker jobSeeker;
	private JobSeekerDescription jobSeekerDescription;
	private List<JobSeekerEducation> jobSeekerEducation;
	private List<JobSeekerExperience> jobSeekerExperience;
	private JobSeekerImage jobSeekerImage;
	private List<JobSeekerKnowledge> jobSeekerKnowledge;
	private List<JobSeekerLanguage> jobSeekerLanguage;
	private List<JobSeekerLink> jobSeekerLinks;	
}
