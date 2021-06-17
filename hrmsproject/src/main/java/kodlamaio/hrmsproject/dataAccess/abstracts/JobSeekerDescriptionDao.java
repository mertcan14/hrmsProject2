package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerDescription;

public interface JobSeekerDescriptionDao extends JpaRepository<JobSeekerDescription, Integer>{

}
