package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageService {

	Result add(JobSeekerLanguage jobSeekerLanguage);
	DataResult<List<JobSeekerLanguage>> getByUserId(int id);
}
