package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.City;

public interface CityService {

	 public DataResult<List<City>> getAll();
	 Result add(City city);
}
