package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv,Integer>{

}
