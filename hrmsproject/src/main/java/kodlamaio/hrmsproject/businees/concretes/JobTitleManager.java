package kodlamaio.hrmsproject.businees.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobTitleService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrmsproject.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Listelendi...");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if (getByName(jobTitle.getName()).getData() != null) {
			return new ErrorResult("Bu iş grubu mevcut.");
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Başarı ile oluşturuldu.");
	}

	@Override
	public DataResult<JobTitle> getByName(String name) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.findJobTitleByName(name), "Bulundu");
	}
	
	
}
