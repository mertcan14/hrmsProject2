package kodlamaio.hrmsproject.core.utilities.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ValidationUserService{

	@Override
	public boolean validateUserByMernis(long nationalId, String firstName, String lastName, int yearOfBirth) {
		FakeMernisService fakeMernis = new FakeMernisService();
		
		boolean result = true;
		
		try {
			result = fakeMernis.ValidateByUser(nationalId, firstName, lastName, yearOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
