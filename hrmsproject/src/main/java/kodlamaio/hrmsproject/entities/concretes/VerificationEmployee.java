package kodlamaio.hrmsproject.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_employees")
public class VerificationEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "is_approve")
	private boolean isApprove;
	
	@Column(name = "approve_date")
	private Date approveDate;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
}
