package kodlamaio.hrmsproject.adapters.cloudinary;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrmsproject.core.utilities.results.DataResult;
import kodlamaio.hrmsproject.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryFileManager implements FileService{

	private Cloudinary cloudinary;
	
	@Autowired
	public CloudinaryFileManager() {
		cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dzpxffh4g",
				"api_key", "411252859162395",
				"api_secret", "U0klfgjFlaasNywRHJ74CYmljOo"));
	}
	
	@Override
	public DataResult<?> add(MultipartFile multipartFile) throws IOException{
		Map addResult = this.cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
		return new SuccessDataResult<>(addResult.get("url"));
	}
	
	@Override
	public DataResult<?> delete(int id) throws IOException{
		var result = this.cloudinary.uploader().upload(id, ObjectUtils.emptyMap());
        return new SuccessDataResult<>(result);
	}
}
