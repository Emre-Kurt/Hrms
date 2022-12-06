package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.dtos.JobAdAddDto;
import demo.hrms.entities.dtos.JobAdGetDto;

public interface JobAdService {

	DataResult<List<JobAdGetDto>> getAll();
	Result add(JobAdAddDto jobAdAddDto);
	
	DataResult<List<JobAdGetDto>> findJobAdByIsActiveOrderByDeadline();
	
	DataResult<List<JobAdGetDto>> findJobAdByIsActiveAndEmployer_CompanyName(String companyName);
}
