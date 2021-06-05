package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findUserByEmail(String email);
}
