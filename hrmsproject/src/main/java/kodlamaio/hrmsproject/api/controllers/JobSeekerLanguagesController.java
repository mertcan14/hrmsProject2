package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLanguageService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLanguage;

@RestController
@RequestMapping("/api/jobseekerlanguages")
public class JobSeekerLanguagesController {

	private JobSeekerLanguageService jobSeekerLanguageService;
	
	@Autowired
	public JobSeekerLanguagesController(JobSeekerLanguageService jobSeekerLanguageService) {
		super();
		this.jobSeekerLanguageService = jobSeekerLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerLanguage jobSeekerLanguage) {
		return this.jobSeekerLanguageService.add(jobSeekerLanguage);
	}
}
