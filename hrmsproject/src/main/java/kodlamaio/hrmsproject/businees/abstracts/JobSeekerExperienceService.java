package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceService {
	Result add(JobSeekerExperience jobSeekerExperience);
	DataResult<List<JobSeekerExperience>> getByUserId(int id);
}
