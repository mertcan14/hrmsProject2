package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.VerificationEmail;

public interface VerificationEmailDao extends JpaRepository<VerificationEmail, Integer>{

}
