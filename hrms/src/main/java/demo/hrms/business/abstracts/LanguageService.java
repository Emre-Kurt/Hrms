package demo.hrms.business.abstracts;

import java.util.List;

import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.Language;

public interface LanguageService {

	DataResult<List<Language>> getAll();
	Result add(Language language);
	
}
