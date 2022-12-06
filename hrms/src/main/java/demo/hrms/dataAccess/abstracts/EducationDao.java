package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education,Integer>{

}
