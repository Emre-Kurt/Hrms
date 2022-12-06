package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {

	DataResult<List<SystemPersonnel>> getAll();
	Result add(SystemPersonnel systemPersonnel);
}
