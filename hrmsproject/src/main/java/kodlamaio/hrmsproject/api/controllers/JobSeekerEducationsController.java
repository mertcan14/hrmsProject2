package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerEducationService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerEducation;

@RestController
@RequestMapping("/api/jobseekereducations")
public class JobSeekerEducationsController {

	private JobSeekerEducationService jobSeekerEducationService;
	
	@Autowired
	public JobSeekerEducationsController(JobSeekerEducationService jobSeekerEducationService) {
		super();
		this.jobSeekerEducationService = jobSeekerEducationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerEducation jobSeekerEducation) {
		return this.jobSeekerEducationService.add(jobSeekerEducation);
	}
	
}
