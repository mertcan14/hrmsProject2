package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	boolean checkNationalId(String nationalId);
	Result add(JobSeeker jobSeeker);
}
