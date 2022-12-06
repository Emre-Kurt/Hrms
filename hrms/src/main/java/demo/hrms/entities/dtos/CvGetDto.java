package demo.hrms.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import demo.hrms.entities.concretes.Education;
import demo.hrms.entities.concretes.JobExperience;
import demo.hrms.entities.concretes.Language;
import demo.hrms.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvGetDto {

	private int id;
	private int candidateId;
	private String candidateFirstName;
	private String candidateLastName;
	private String githubLink;
	private String linkedinLink;
	private String photo;
	private String description;
	private LocalDate coverLetter;
	private List<JobExperience> jobExperiences;
	private List<Language> languages;
	private List<Skill> technologies;
	private List<Education> educations;
}
