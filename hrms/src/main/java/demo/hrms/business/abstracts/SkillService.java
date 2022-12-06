package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.Skill;

public interface SkillService {

	DataResult<List<Skill>> getAll();
	Result add(Skill skill);
}
