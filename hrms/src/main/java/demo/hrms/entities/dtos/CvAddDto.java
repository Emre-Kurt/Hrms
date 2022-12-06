package demo.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvAddDto {

	private int id;
	private int candidateId;
	private String githubLink;
	private String linkedinLink;
	private String photo;
	private String coverLetter;
	private LocalDate createdDate;
	
}
