package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerDescriptionService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;

@RestController
@RequestMapping("/api/jobseekerdescriptions")
public class JobSeekerDescriptionsController {

	private JobSeekerDescriptionService jobSeekerDescriptionService;
	
	@Autowired
	public JobSeekerDescriptionsController(JobSeekerDescriptionService jobSeekerDescriptionService, JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerDescriptionService = jobSeekerDescriptionService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerDescription jobSeekerDescription) {
		return this.jobSeekerDescriptionService.add(jobSeekerDescription);
	}
}
