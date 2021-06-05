package kodlamaio.hrmsproject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsproject.businees.abstracts.AuthService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Employer;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/auths")
public class AuthsController {
	private AuthService authService;
	
	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registeremployer")
	public Result registerEmployer(@RequestBody Employer employer, String passwordConfirm) {
		return this.authService.registerEmployer(employer, passwordConfirm);
	}
	
	@PostMapping("/registerjobseeker")
	public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker, String passwordConfirm) {
		return this.authService.registerJobSeeker(jobSeeker, passwordConfirm);
	}
}
