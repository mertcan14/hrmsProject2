package kodlamaio.hrmsproject.businees.abstracts;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.abstracts.User;

public interface UserService {
	DataResult<User> getByEmail(String email);
	boolean checkEmail(String email);
	Result add(User user);
}
