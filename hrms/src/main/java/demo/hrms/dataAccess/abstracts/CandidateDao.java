package demo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

	List<Candidate> findAllByNationalityId(String nationalityId);
	
	boolean existsByNationalityId(String nationalityId);
	
	boolean existsByEmail(String email);
	
}
