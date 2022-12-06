package demo.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdGetDto {

	private int id; 
	private int jobPositionId;   
	private String jobPositionPozisyon; 
	private int cityId;  
	private String cityCityName;
	private int employerId;   
	private String employerCompanyName;
	private String employerWebAddress;
	private String employerPhoneNumber;
	private String employerEmail;
	private LocalDate deadline;
	private LocalDate creationDate;
	private boolean isActive;
	private String jobDescription;
	private int minSalary;
	private int maxSalary;
	private int numberOfPosition;   
	
}
