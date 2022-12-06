package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer>{

}
