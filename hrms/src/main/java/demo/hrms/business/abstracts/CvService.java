package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.dtos.CvAddDto;
import demo.hrms.entities.dtos.CvGetDto;

public interface CvService {

	DataResult<List<CvGetDto>> getAll();
	Result add(CvAddDto cvAddDto);
}
