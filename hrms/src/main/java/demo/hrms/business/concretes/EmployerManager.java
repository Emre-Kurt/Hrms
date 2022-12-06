package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.EmployerService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.ErrorResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.EmployerDao;
import demo.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İş verenler listelendi listelendi");
		
	}

	@Override
	public Result add(Employer employer) {
		if(employerDao.existsByEmail(employer.getEmail())) {
			return new ErrorResult("Bu mail daha önce kullanılmıştır");
		}else
		this.employerDao.save(employer);
		return new SuccessResult("İşveren eklendi");
	}

}
