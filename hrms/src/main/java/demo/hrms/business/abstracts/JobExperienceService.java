package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {

	DataResult<List<JobExperience>> getAll();
	Result add(JobExperience jobExperience);
}
