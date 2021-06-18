package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerCvService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.dtos.JobSeekerCv;

@RestController
@RequestMapping("/api/jobseekercvs")
public class JobSeekerCvsController {

	private JobSeekerCvService jobSeekerCvService;
	
	@Autowired
	public JobSeekerCvsController(JobSeekerCvService jobSeekerCvService) {
		super();
		this.jobSeekerCvService = jobSeekerCvService;
	}
	
	@GetMapping("getbyid")
	public DataResult<JobSeekerCv> getById(int id){
		return this.jobSeekerCvService.getById(id);
	}
}
