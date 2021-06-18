package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;

public interface JobSeekerLinkDao extends JpaRepository<JobSeekerLink, Integer>{

	@Query("From JobSeekerLink where job_seeker_id=:id")
	List<JobSeekerLink> getByJobSeeker(int id);
}
