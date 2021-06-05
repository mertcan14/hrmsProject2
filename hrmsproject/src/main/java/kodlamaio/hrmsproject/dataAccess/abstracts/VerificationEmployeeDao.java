package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.VerificationEmployee;

public interface VerificationEmployeeDao extends JpaRepository<VerificationEmployee, Integer>{

}
