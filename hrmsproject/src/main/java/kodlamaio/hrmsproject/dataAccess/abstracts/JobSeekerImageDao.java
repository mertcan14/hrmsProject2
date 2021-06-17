package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsproject.entities.concretes.JobSeekerImage;

public interface JobSeekerImageDao extends JpaRepository<JobSeekerImage, Integer>{

}
