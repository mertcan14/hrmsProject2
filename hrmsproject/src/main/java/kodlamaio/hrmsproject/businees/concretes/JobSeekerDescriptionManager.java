package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerDescriptionService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerDescriptionDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;

@Service
public class JobSeekerDescriptionManager implements JobSeekerDescriptionService{

	private JobSeekerDescriptionDao jobSeekerDescriptionDao;
	
	@Autowired
	public JobSeekerDescriptionManager(JobSeekerDescriptionDao jobSeekerDescriptionDao) {
		super();
		this.jobSeekerDescriptionDao = jobSeekerDescriptionDao;
	}
	
	@Override
	public Result add(JobSeekerDescription jobSeekerDescription) {
		this.jobSeekerDescriptionDao.save(jobSeekerDescription);
		return new SuccessResult();
	}

	@Override
	public DataResult<JobSeekerDescription> getByUserId(int id) {
		return new SuccessDataResult<JobSeekerDescription>(this.jobSeekerDescriptionDao.getByjobSeeker(id));
	}

}
