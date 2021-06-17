package kodlamaio.hrmsproject.businees.abstracts;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.entities.concretes.JobSeekerImage;

public interface JobSeekerImageService {

	Result add(JobSeekerImage jobSeekerImage, MultipartFile multipartFile) throws IOException;
}
