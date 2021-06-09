package kodlamaio.hrmsproject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aj.org.objectweb.asm.Type;
import kodlamaio.hrmsproject.businees.abstracts.JobAdvertisementService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getactive")
	public DataResult<List<JobAdvertisement>> getActive(){
		return this.jobAdvertisementService.getActiveAdvert();
	}
	
	@GetMapping("/getactiveasc")
	public DataResult<List<JobAdvertisement>> getActiveAsc(){
		return this.jobAdvertisementService.getActiveAdvertAsc();
	}
	
	@GetMapping("/getbyemployer")
	public DataResult<List<JobAdvertisement>> getByEmployer(int id){
		return this.jobAdvertisementService.getByEmployer(id);
	}
	
	@GetMapping("/isactivefalse")
	public Result isActiveFalse(int id) {
		return this.jobAdvertisementService.isActiveFalse(id);
	}
}
