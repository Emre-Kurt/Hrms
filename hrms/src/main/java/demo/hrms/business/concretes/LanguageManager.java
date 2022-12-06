package demo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.LanguageService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.LanguageDao;
import demo.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}


	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"Yabancı Dil listelendi");
	}


	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("İş deneyimi eklendi");
	}
}
