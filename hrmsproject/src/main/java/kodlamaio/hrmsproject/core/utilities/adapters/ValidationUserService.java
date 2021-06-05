package kodlamaio.hrmsproject.core.utilities.adapters;

public interface ValidationUserService {
	boolean validateUserByMernis(long nationalId, String firstName, String lastName, int yearOfBirth);
}
