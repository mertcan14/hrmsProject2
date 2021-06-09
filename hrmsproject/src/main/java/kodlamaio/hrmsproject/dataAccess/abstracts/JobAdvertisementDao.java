package kodlamaio.hrmsproject.dataAccess.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsproject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	@Query("From JobAdvertisement where is_active = true and application_deadline > :date")
	List<JobAdvertisement> findAllOpenByAfter(Date date);
	
	@Query("From JobAdvertisement where is_active = true and application_deadline > :date Order By application_deadline Asc")
	List<JobAdvertisement> findAllAfterAsc(Date date);
	
	@Query("From JobAdvertisement where employer_id =:id")
	List<JobAdvertisement> findAllOpenByEmployer(int id);
}
