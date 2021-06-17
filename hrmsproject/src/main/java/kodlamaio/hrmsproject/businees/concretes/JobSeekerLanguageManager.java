package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobSeekerLanguageService;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerLanguageDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerLanguage;

@Service
public class JobSeekerLanguageManager implements JobSeekerLanguageService{

	private JobSeekerLanguageDao jobSeekerLanguageDao;
	
	@Autowired
	public JobSeekerLanguageManager(JobSeekerLanguageDao jobSeekerLanguageDao) {
		super();
		this.jobSeekerLanguageDao = jobSeekerLanguageDao;
	}
	
	@Override
	public Result add(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return new SuccessResult("Başarı ile eklendi");
	}

}
