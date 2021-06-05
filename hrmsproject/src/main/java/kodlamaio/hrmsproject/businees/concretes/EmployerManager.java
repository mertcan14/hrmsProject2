package kodlamaio.hrmsproject.businees.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.EmployerService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrmsproject.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Listelendi...");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Başarı ile oluşturuldu");
	}

	@Override
	public DataResult<Employer> getByEmail(String email) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findEmployerByEmail(email), "Bulundu..");
	}

}
