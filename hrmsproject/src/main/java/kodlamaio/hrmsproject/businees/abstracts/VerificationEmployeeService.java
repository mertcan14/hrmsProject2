package kodlamaio.hrmsproject.businees.abstracts;

import java.util.List;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmployee;

public interface VerificationEmployeeService {
	DataResult<List<VerificationEmployee>> getAll();
	Result add(VerificationEmployee verificationEmployee);
}
