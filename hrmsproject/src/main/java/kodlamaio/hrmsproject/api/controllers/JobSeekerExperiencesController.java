package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerExperienceService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerExperience;

@RestController
@RequestMapping("/api/jobseekerexperience")
public class JobSeekerExperiencesController {

	private JobSeekerExperienceService jobSeekerExperienceService;
	
	@Autowired
	public JobSeekerExperiencesController(JobSeekerExperienceService jobSeekerExperienceService) {
		super();
		this.jobSeekerExperienceService = jobSeekerExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerExperience jobSeekerExperience) {
		return this.jobSeekerExperienceService.add(jobSeekerExperience);
	}
}
