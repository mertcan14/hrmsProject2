package kodlamaio.hrmsproject.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_email")
public class VerificationEmail{
	
	@Id
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name = "verification_code")
	private String verificationCode;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "is_approve")
	private boolean isApprove;
}
