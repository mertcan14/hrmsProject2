package kodlamaio.hrmsproject.businees.abstracts;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.entities.dtos.JobSeekerCv;

public interface JobSeekerCvService {

	DataResult<JobSeekerCv> getById(int id);
}
