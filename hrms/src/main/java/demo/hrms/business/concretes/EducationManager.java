package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.EducationService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.EducationDao;
import demo.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Eğitimler listelendi");
	}

	@Override
	public Result add(Education education) {
		
		this.educationDao.save(education);
		return new SuccessResult("Eğitim  eklendi");
	}

}
