package demo.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.CvService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.CvDao;
import demo.hrms.entities.concretes.Cv;
import demo.hrms.entities.dtos.CvAddDto;
import demo.hrms.entities.dtos.CvGetDto;


@Service
public class CvManager implements CvService {

	
	CvDao cvDao;
	ModelMapper modelMapper;
	
	@Autowired
	public CvManager(CvDao cvDao,ModelMapper modelMapper) {
		super();
		this.cvDao = cvDao;
		this.modelMapper=modelMapper;
	}

	@Override
	public DataResult<List<CvGetDto>> getAll() {
		return new SuccessDataResult<List<CvGetDto>>(this.cvDao.findAll().stream().map(element->modelMapper.map(element, CvGetDto.class)).collect(Collectors.toList()),"Özgeçmiş listelendi");
	}

	@Override
	public Result add(CvAddDto cvAddDto) {
		Cv cv=modelMapper.map(cvAddDto, Cv.class);
		this.cvDao.save(cv);
		return new SuccessResult("Özgeçmiş  eklendi");
	}

}
