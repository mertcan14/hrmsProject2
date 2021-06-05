package kodlamaio.hrmsproject.businees.abstracts;

import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.Employer;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;

public interface AuthService {
	Result registerEmployer(Employer employer, String passwordConfirm);
	Result registerJobSeeker(JobSeeker jobSeeker, String passwordConfirm);
}
