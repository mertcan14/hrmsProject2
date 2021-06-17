package kodlamaio.hrmsproject.businees.abstracts;


import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;

public interface JobSeekerDescriptionService {

	Result add(JobSeekerDescription jobSeekerDescription);
}
