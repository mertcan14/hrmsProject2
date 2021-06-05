package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmail;

public interface VerificationEmailService {
	DataResult<List<VerificationEmail>> getAll();
	Result add(VerificationEmail verificationEmail);
	Result add(Integer id, String code, boolean isActivated);
}
