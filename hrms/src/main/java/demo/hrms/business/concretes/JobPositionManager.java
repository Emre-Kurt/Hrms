package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.JobPositionService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.ErrorResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.JobPositionDao;
import demo.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
    @Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi listelendi");
				
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(jobPositionDao.findAllByPozisyon(jobPosition.getPozisyon()).stream().count() !=0 ) {
			return new ErrorResult("Böyle Bir İş Başlığı Mevcut");
			
		}else
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("pozisyon eklendi");
	

}
}