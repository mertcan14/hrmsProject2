package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerEducation;

public interface JobSeekerEducationService {

	Result add(JobSeekerEducation jobSeekerEducation);
	DataResult<List<JobSeekerEducation>> getByUserId(int id);
}
