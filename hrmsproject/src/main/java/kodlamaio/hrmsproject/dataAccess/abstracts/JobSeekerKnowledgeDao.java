package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;

public interface JobSeekerKnowledgeDao extends JpaRepository<JobSeekerKnowledge, Integer>{

	@Query("From JobSeekerKnowledge where job_seeker_id=:id")
	List<JobSeekerKnowledge> getByJobSeeker(int id);
}
