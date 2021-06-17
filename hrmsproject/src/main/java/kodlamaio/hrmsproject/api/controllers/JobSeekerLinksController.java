package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLinkService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;

@RestController
@RequestMapping("/api/jobseekerlinks")
public class JobSeekerLinksController {

	private JobSeekerLinkService jobSeekerLinkService;
	
	@Autowired
	public JobSeekerLinksController(JobSeekerLinkService jobSeekerLinkService) {
		super();
		this.jobSeekerLinkService = jobSeekerLinkService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerLink jobSeekerLink) {
		return this.jobSeekerLinkService.add(jobSeekerLink);
	}
}
