package kodlamaio.hrmsproject.mernisService;

public class FakeMernisService {
	public boolean ValidateByUser(long nationalId, String firstName, String lastName, int yearOfBirth) {
		if (nationalId % 10 == 1) {
			return false;
		}
		return true;
	}
}
