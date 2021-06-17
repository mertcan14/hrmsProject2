package kodlamaio.hrmsproject.adapters.cloudinary;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;

public interface FileService {

	DataResult<?> add(MultipartFile multipartFile) throws IOException;
	DataResult<?> delete(int id) throws IOException;
}
