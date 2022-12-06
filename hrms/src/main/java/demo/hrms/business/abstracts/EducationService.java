package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.Education;

public interface EducationService {

	DataResult<List<Education>> getAll();
	Result add(Education education);
}
