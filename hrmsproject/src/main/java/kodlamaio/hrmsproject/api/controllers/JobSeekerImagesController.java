package kodlamaio.hrmsproject.api.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerImageService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerImage;

@RestController
@RequestMapping("/api/jobseekerimages")
public class JobSeekerImagesController {

	private JobSeekerImageService jobSeekerImageService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerImagesController(JobSeekerImageService jobSeekerImageService, JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerImageService = jobSeekerImageService;
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) throws IOException {
		var jobSeeker = this.jobSeekerService.getById(id);
		JobSeekerImage newImage = new JobSeekerImage();
		newImage.setJobSeeker(jobSeeker.getData());
		return this.jobSeekerImageService.add(newImage, imageFile);
	}
}
