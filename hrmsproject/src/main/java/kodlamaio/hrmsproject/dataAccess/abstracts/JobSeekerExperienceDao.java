package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceDao extends JpaRepository<JobSeekerExperience, Integer>{

	@Query("From JobSeekerExperience where job_seeker_id=:id")
	List<JobSeekerExperience> getByJobSeeker(int id);
}
