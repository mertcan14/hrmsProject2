package kodlamaio.hrmsproject.businees.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.VerificationEmailService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.VerificationEmailDao;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmail;

@Service
public class VerificationEmailManager implements VerificationEmailService{

	private VerificationEmailDao verificationEmailDao;
	
	@Autowired
	public VerificationEmailManager(VerificationEmailDao verificationEmailDao) {
		super();
		this.verificationEmailDao = verificationEmailDao;
	}
	
	@Override
	public DataResult<List<VerificationEmail>> getAll() {
		return new SuccessDataResult<List<VerificationEmail>>(this.verificationEmailDao.findAll(), "Listelendi...");
	}

	@Override
	public Result add(VerificationEmail verificationEmail) {
		System.out.println(verificationEmail.getUserId());
		this.verificationEmailDao.save(verificationEmail);
		return new SuccessResult("Başarı ile eklendi");
	}

	@Override
	public Result add(Integer id, String code, boolean isActivated) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
