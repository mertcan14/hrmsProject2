package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerKnowledgeService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;

@RestController
@RequestMapping("/api/jobseekerknowledges")
public class JobSeekerKnowledgesController {

	private JobSeekerKnowledgeService jobSeekerKnowledgeService;
	
	@Autowired
	public JobSeekerKnowledgesController(JobSeekerKnowledgeService jobSeekerKnowledgeService) {
		super();
		this.jobSeekerKnowledgeService = jobSeekerKnowledgeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerKnowledge jobSeekerKnowledge) {
		return this.jobSeekerKnowledgeService.add(jobSeekerKnowledge);
	}
}
