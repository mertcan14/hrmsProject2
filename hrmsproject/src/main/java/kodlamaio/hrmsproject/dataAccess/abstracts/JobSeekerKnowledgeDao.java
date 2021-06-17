package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerKnowledge;

public interface JobSeekerKnowledgeDao extends JpaRepository<JobSeekerKnowledge, Integer>{

}
