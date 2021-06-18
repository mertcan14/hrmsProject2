package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;

public interface JobSeekerLinkService{

	Result add(JobSeekerLink jobSeekerLink);
	DataResult<List<JobSeekerLink>> getByUserId(int id);
}
