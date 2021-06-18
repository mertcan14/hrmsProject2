package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageDao extends JpaRepository<JobSeekerLanguage, Integer>{

	@Query("From JobSeekerLanguage where job_seeker_id=:id")
	List<JobSeekerLanguage> getByJobSeeker(int id);
}
