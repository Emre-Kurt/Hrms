package demo.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cvs")
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@OneToMany(mappedBy ="cv")
	private List<Education> education;
	
	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy = "cv")
	private List<Language> language;
	
	@OneToMany(mappedBy = "cv")
    private  List<Skill> skill;
	
	@JoinColumn(name="candidate_id")
	@ManyToOne
	private Candidate candidate;

}
