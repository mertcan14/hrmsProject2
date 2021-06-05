package kodlamaio.hrmsproject.businees.concretes;

import java.sql.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsproject.businees.abstracts.AuthService;
import kodlamaio.hrmsproject.businees.abstracts.EmployeeService;
import kodlamaio.hrmsproject.businees.abstracts.EmployerService;
import kodlamaio.hrmsproject.businees.abstracts.JobSeekerService;
import kodlamaio.hrmsproject.businees.abstracts.UserService;
import kodlamaio.hrmsproject.businees.abstracts.VerificationEmailService;
import kodlamaio.hrmsproject.businees.abstracts.VerificationEmployeeService;
import kodlamaio.hrmsproject.core.utilities.adapters.ValidationUserService;
import kodlamaio.hrmsproject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsproject.core.utilities.results.Result;
import kodlamaio.hrmsproject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsproject.core.verification.VerificationService;
import kodlamaio.hrmsproject.entities.concretes.Employer;
import kodlamaio.hrmsproject.entities.concretes.JobSeeker;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmail;
import kodlamaio.hrmsproject.entities.concretes.VerificationEmployee;

@Service
public class AuthManager implements AuthService{

	private JobSeekerService jobSeekerService;
	private EmployerService employerService;
	private ValidationUserService validationUserService;
	private UserService userService;
	private VerificationEmailService verificationEmailService;
	private VerificationService verificationService;
	private VerificationEmployeeService verificationEmployeeService;
	private EmployeeService employeeService;
	
	@Autowired
	public AuthManager(JobSeekerService jobSeekerService, EmployerService employerService, ValidationUserService validationUserService,
			UserService userService, VerificationEmailService verificationEmailService, VerificationService verificationService,
			VerificationEmployeeService verificationEmployeeService, EmployeeService employeeService) {
		super();
		this.jobSeekerService = jobSeekerService;
		this.employerService = employerService;
		this.validationUserService = validationUserService;
		this.userService = userService;
		this.verificationEmailService = verificationEmailService;
		this.verificationService = verificationService;
		this.verificationEmployeeService = verificationEmployeeService;
		this.employeeService = employeeService;
	}
	
	@Override
	public Result registerEmployer(Employer employer, String passwordConfirm) {
		if (checkFieldNullForEmployer(employer) == false) {
			return new ErrorResult("Bilgiler Eksik");
		}
		if(checkEmail(employer.getEmail())) {
			return new ErrorResult("Email ile kayıt var");
		}
		this.employerService.add(employer);
		String code = this.verificationService.sendCode();
		verificationCodeAdd(code, employer.getEmail());
		verificationEmployeeAdd(employer.getEmail());
		return new SuccessResult();
	}

	@Override
	public Result registerJobSeeker(JobSeeker jobSeeker, String passwordConfirm) {
		if (checkPerson(Long.parseLong(jobSeeker.getTcNo()), jobSeeker.getFirstName(), jobSeeker.getLastName(), Integer.parseInt(jobSeeker.getBirthYear())) == false) {
			return new ErrorResult("Bilgiler Hatalı...");
		}
		if (checkFieldNullForJobSeeker(jobSeeker) == false) {
			return new ErrorResult("Bilgiler Eksik");
		}
		if(checkNationalId(jobSeeker.getTcNo())) {
			return new ErrorResult("Kimlik numarası ile kayıt var");
		}
		if(checkEmail(jobSeeker.getEmail())) {
			return new ErrorResult("Email ile kayıt var");
		}
		this.jobSeekerService.add(jobSeeker);
		String code = this.verificationService.sendCode();
		verificationCodeAdd(code, jobSeeker.getEmail());
		return new SuccessResult();
	}
	
	
	
	
	
	
	private  boolean checkFieldNullForJobSeeker(JobSeeker jobSeeker) {
		if (jobSeeker.getBirthYear() != null && jobSeeker.getEmail() != null && jobSeeker.getLastName() != null 
				&& jobSeeker.getFirstName() != null  && jobSeeker.getPassword() != null && jobSeeker.getTcNo() != null) {
			return true;
		}
		return false;
	}
	
	
	private  boolean checkFieldNullForEmployer(Employer employer) {
		if (employer.getEmail() != null  && employer.getPassword() != null 
				&& employer.getCompanyName() != null && employer.getPhoneNumber() != null && employer.getWebUrl() != null) {
			return true;
		}
		return false;
	}
	
	private boolean checkEmail(String email) {
		return this.userService.checkEmail(email);
	}
	
	
	private boolean checkPerson(long nationalId, String firstName, String lastName, int yearBirth) {
		return validationUserService.validateUserByMernis(nationalId, firstName, lastName, yearBirth);
	}
	
	private boolean checkNationalId(String nationalId) {
		return this.jobSeekerService.checkNationalId(nationalId);
	}
	
	private void verificationCodeAdd(String code, String email) {
		var id = this.userService.getByEmail(email).getData().getId();
		System.out.println(id);
		Date date = new Date(System.currentTimeMillis());
		VerificationEmail verificationEmail = new VerificationEmail(id, code, date, false);
		this.verificationEmailService.add(verificationEmail);
		System.out.println("Dogrulama kodu gonderildi " + email );
	}
	
	private void verificationEmployeeAdd(String email) {
		var result = employerService.getByEmail(email);
		var resultt = employeeService.getByEmail("mert@gmail.com");
		Date date = new Date(System.currentTimeMillis());
		VerificationEmployee newVerification = new VerificationEmployee(0,true, date, 3, result.getData().getId());
		var resulttt = verificationEmployeeService.add(newVerification);
		System.out.println(resulttt.getMessage());
	}

}
