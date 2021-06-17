package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLinkService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerLinkDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;

@Service
public class JobSeekerLinkManager implements JobSeekerLinkService{

	private JobSeekerLinkDao jobSeekerLinkDao;
	
	@Autowired
	public JobSeekerLinkManager(JobSeekerLinkDao jobSeekerLinkDao) {
		super();
		this.jobSeekerLinkDao = jobSeekerLinkDao;
	}
	
	@Override
	public Result add(JobSeekerLink jobSeekerLink) {
		this.jobSeekerLinkDao.save(jobSeekerLink);
		return new SuccessResult("Başarı ile eklendi");
	}

	
}
