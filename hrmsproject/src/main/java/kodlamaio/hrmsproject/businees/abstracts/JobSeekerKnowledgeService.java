package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;

public interface JobSeekerKnowledgeService {

	Result add(JobSeekerKnowledge jobSeekerKnowledge);
	DataResult<List<JobSeekerKnowledge>> getByUserId(int id);
}
