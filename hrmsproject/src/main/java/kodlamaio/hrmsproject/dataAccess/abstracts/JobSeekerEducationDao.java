package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerEducation;

public interface JobSeekerEducationDao extends JpaRepository<JobSeekerEducation, Integer>{

	@Query("From JobSeekerEducation where job_seeker_id=:id")
	List<JobSeekerEducation> getByjobSeeker(int id);
}
