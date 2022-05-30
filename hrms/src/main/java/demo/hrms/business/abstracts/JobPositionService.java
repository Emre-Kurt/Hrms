package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);

}
