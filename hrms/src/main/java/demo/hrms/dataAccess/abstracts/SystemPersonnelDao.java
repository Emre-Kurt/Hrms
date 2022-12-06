package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel,Integer> {

	
}
