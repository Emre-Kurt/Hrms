package demo.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdAddDto {

	private int id;
	private int employerId;
	private int jobPositionId;
	private int numberOfPosition;
	private int minSalary;
	private int maxSalary;
	private int cityId;
	private LocalDate deadline;
	private LocalDate creationDate;
	private String jobDescription;
	private boolean isActive;
}
