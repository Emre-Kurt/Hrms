package demo.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import demo.hrms.entities.concretes.JobAd;


public interface JobAdDao extends JpaRepository<JobAd,Integer>{

	JobAd findAllById(int id);
	
	List<JobAd> findJobAdByIsActiveOrderByDeadline(boolean status);
	
	List<JobAd> findJobAdByIsActiveAndEmployer_CompanyName(boolean status, String companyName);
	
}
