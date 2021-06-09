package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result isActiveFalse(int id);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getActiveAdvert();
	DataResult<List<JobAdvertisement>> getActiveAdvertAsc();
	DataResult<List<JobAdvertisement>> getByEmployer(int id);
	
}
