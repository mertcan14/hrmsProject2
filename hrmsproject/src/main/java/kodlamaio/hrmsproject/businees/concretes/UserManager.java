package kodlamaio.hrmsproject.businees.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.UserService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsproject.entities.abstracts.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email), "Bulundu");
	}

	@Override
	public boolean checkEmail(String email) {
		if (this.userDao.findUserByEmail(email) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Başarı ile oluşturuldu");
	}

}
