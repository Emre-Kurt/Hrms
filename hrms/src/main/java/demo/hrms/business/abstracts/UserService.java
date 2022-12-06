package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
}
