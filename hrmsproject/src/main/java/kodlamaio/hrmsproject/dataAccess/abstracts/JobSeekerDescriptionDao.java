package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;

public interface JobSeekerDescriptionDao extends JpaRepository<JobSeekerDescription, Integer>{

	@Query("From JobSeekerDescription where job_seeker_id=:id")
	JobSeekerDescription getByjobSeeker(int id);
}
