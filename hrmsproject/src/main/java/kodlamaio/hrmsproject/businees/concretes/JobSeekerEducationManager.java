package kodlamaio.hrmsproject.businees.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerEducationService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerEducationDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerEducation;

@Service
public class JobSeekerEducationManager implements JobSeekerEducationService{

	private JobSeekerEducationDao jobSeekerEducationDao;
	
	@Autowired
	public JobSeekerEducationManager(JobSeekerEducationDao jobSeekerEducationDao) {
		super();
		this.jobSeekerEducationDao = jobSeekerEducationDao;
	}
	
	@Override
	public Result add(JobSeekerEducation jobSeekerEducation) {
		this.jobSeekerEducationDao.save(jobSeekerEducation);
		return new SuccessResult("başarı ile eklendi");
	}

	@Override
	public DataResult<List<JobSeekerEducation>> getByUserId(int id) {
		return new SuccessDataResult<List<JobSeekerEducation>>(this.jobSeekerEducationDao.getByjobSeeker(id));
	}

}
