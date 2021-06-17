package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerLink;

public interface JobSeekerLinkDao extends JpaRepository<JobSeekerLink, Integer>{

}
