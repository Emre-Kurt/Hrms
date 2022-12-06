package demo.hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name="job_ads")
public class JobAd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="number_of_position")
	private int numberOfPosition;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="creation_date")
	private LocalDate creationDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@JoinColumn(name="job_position_id")
	@ManyToOne
	private JobPosition jobPosition;
	
	@JoinColumn(name="city_id")
	@ManyToOne
	private City city;
	
	 
	@JoinColumn(name="employer_id")
	@ManyToOne
	private Employer employer;
}
