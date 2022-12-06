package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import demo.hrms.business.abstracts.CandidateService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.ErrorResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.CandidateDao;
import demo.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
		
		
		
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Adaylar listelendi Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		
		
		
	 if(candidateDao.existsByNationalityId(candidate.getNationalityId()))
		{
			return new ErrorResult("Bu TC daha önce kullanılmıştır");
		}
		else if(candidateDao.existsByEmail(candidate.getEmail()))
		{
			return new ErrorResult("Bu email daha önce kullanılmıştır");
		}
		else 
			this.candidateDao.save(candidate);
		return new SuccessResult("Aday eklendi");
		
	}

}
