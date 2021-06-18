package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerCvService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerDescriptionService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerEducationService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerExperienceService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerImageService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerKnowledgeService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLanguageService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLinkService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.entities.dtos.JobSeekerCv;
import lombok.experimental.var;

@Service
public class JobSeekerCvManager implements JobSeekerCvService{

	private JobSeekerDescriptionService jobSeekerDescriptionService;
	private JobSeekerEducationService jobSeekerEducationService;
	private JobSeekerService jobSeekerService;
	private JobSeekerExperienceService jobSeekerExperience;
	private JobSeekerImageService jobSeekerImageService;
	private JobSeekerKnowledgeService jobSeekerKnowledgeService;
	private JobSeekerLanguageService jobSeekerLanguageService;
	private JobSeekerLinkService jobSeekerLinkService;
	
	@Autowired
	public JobSeekerCvManager(JobSeekerDescriptionService jobSeekerDescriptionService, JobSeekerEducationService jobSeekerEducationService,
			JobSeekerService jobSeekerService, JobSeekerExperienceService jobSeekerExperience, JobSeekerImageService jobSeekerImageService,
			JobSeekerKnowledgeService jobSeekerKnowledgeService, JobSeekerLanguageService jobSeekerLanguageService,
			JobSeekerLinkService jobSeekerLinkService) {
		super();
		this.jobSeekerDescriptionService=jobSeekerDescriptionService;
		this.jobSeekerEducationService = jobSeekerEducationService;
		this.jobSeekerService = jobSeekerService;
		this.jobSeekerExperience = jobSeekerExperience;
		this.jobSeekerImageService = jobSeekerImageService;
		this.jobSeekerKnowledgeService = jobSeekerKnowledgeService;
		this.jobSeekerLanguageService = jobSeekerLanguageService;
		this.jobSeekerLinkService = jobSeekerLinkService;
	}

	@Override
	public DataResult<JobSeekerCv> getById(int id) {
		var description = this.jobSeekerDescriptionService.getByUserId(id);
		var education = this.jobSeekerEducationService.getByUserId(id);
		var jobSeeker = this.jobSeekerService.getById(id);
		var experience = this.jobSeekerExperience.getByUserId(id);
		var image = this.jobSeekerImageService.getByUserId(id);
		var knowledge = this.jobSeekerKnowledgeService.getByUserId(id);
		var language = this.jobSeekerLanguageService.getByUserId(id);
		var link = this.jobSeekerLinkService.getByUserId(id);
		JobSeekerCv newCv = new JobSeekerCv(jobSeeker.getData(), description.getData(), education.getData(), experience.getData(),
				image.getData(), knowledge.getData(), language.getData(), link.getData());
		return new SuccessDataResult<JobSeekerCv>(newCv);
	}
	
//	@Override
//	public DataResult<JobSeekerCv> getById(int id) {
//		var description = this.jobSeekerDescriptionService.getByUserId(id);
//		var education = this.jobSeekerEducationService.getByUserId(id);
//		var jobSeeker = this.jobSeekerService.getById(id);
//		System.out.println(description.getData().getDescription());
//		JobSeekerCv newCv = new JobSeekerCv(description.getData().getId(), jobSeeker.getData().getFirstName(), jobSeeker.getData().getLastName(),
//				jobSeeker.getData().getBirthYear(), description.getData().getDescription(), education.getData().getSchoolName(), education.getData().getDepartman(),
//				education.getData().getStartDate(), education.getData().getEndDate());
//		return new SuccessDataResult<JobSeekerCv>(newCv);
//	}

}
