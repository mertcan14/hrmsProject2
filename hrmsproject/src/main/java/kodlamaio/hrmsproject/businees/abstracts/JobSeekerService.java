package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;
import kodlamaio.hrmsproject.entities.dtos.JobSeekerCv;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	boolean checkNationalId(String nationalId);
	Result add(JobSeeker jobSeeker);
	DataResult<JobSeeker> getById(int id);
}
