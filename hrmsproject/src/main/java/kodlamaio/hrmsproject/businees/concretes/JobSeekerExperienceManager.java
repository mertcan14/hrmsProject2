package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerExperienceService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerExperienceDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerExperience;

@Service
public class JobSeekerExperienceManager implements JobSeekerExperienceService{

	private JobSeekerExperienceDao jobSeekerExperienceDao;
	
	@Autowired
	public JobSeekerExperienceManager(JobSeekerExperienceDao jobSeekerExperienceDao) {
		super();
		this.jobSeekerExperienceDao = jobSeekerExperienceDao;
	}
	
	@Override
	public Result add(JobSeekerExperience jobSeekerExperience) {
		this.jobSeekerExperienceDao.save(jobSeekerExperience);
		return new SuccessResult("Başarı ile eklendi");
	}

}
