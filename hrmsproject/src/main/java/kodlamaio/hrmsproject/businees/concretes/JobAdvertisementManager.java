package kodlamaio.hrmsproject.businees.concretes;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.JobAdvertisementService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrmsproject.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		LocalDate date = LocalDate.now();
		jobAdvertisement.setReleaseDate(date);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Başarı ile eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Başarı ile listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvert() {
		Date date = new Date(System.currentTimeMillis());
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllOpenByAfter(date));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertAsc() {
		Date date = new Date(System.currentTimeMillis());
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllAfterAsc(date));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer(int id) {
		//System.out.println(this.jobAdvertisementDao.findByEmployer(1));
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllOpenByEmployer(id),"Başarı ile bulundu");
	}

	@Override
	public Result isActiveFalse(int id) {
		JobAdvertisement result = this.jobAdvertisementDao.getOne(id);
		result.setActive(false);
		this.jobAdvertisementDao.save(result);
		return new SuccessResult("Pasif moda geçildi.");
	}
	
	

}
