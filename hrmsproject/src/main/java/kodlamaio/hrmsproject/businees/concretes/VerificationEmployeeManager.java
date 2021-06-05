package kodlamaio.hrmsproject.businees.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.VerificationEmployeeService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.VerificationEmployeeDao;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmployee;

@Service
public class VerificationEmployeeManager implements VerificationEmployeeService{

	private VerificationEmployeeDao verificationEmployeeDao;
	
	@Autowired
	public VerificationEmployeeManager(VerificationEmployeeDao verificationEmployeeDao) {
		super();
		this.verificationEmployeeDao = verificationEmployeeDao;
	}
	
	@Override
	public DataResult<List<VerificationEmployee>> getAll() {
		return new SuccessDataResult<List<VerificationEmployee>>(this.verificationEmployeeDao.findAll(), "Listelendi...");
	}

	@Override
	public Result add(VerificationEmployee verificationEmployee) {
		this.verificationEmployeeDao.save(verificationEmployee);
		return new SuccessResult("Başarı ile oluşturuldu.");
	}

}
