package kodlamaio.hrmsproject.businees.concretes;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrmsproject.adapters.cloudinary.FileService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerImageService;
import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.dataAccess.abstracts.JobSeekerImageDao;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerImage;

@Service
public class JobSeekerImageManager implements JobSeekerImageService{

	private JobSeekerImageDao jobSeekerImageDao;
	private FileService fileService;
	
	@Autowired
	public JobSeekerImageManager(JobSeekerImageDao jobSeekerImageDao, FileService fileService) {
		super();
		this.jobSeekerImageDao=jobSeekerImageDao;
		this.fileService = fileService;
	}
	
	@Override
	public Result add(JobSeekerImage jobSeekerImage, MultipartFile multipartFile) throws IOException {
		var result = this.fileService.add(multipartFile);
		jobSeekerImage.setUrl(result.getData().toString());
		this.jobSeekerImageDao.save(jobSeekerImage);
		return new SuccessResult("başarı ile eklendi");
	}

	@Override
	public DataResult<JobSeekerImage> getByUserId(int id) {
		return new SuccessDataResult<JobSeekerImage>(this.jobSeekerImageDao.getByJobSeeker(id));
	}

}
