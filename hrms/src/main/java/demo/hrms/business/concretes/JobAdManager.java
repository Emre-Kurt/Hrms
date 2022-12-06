package demo.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.hrms.business.abstracts.JobAdService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.core.utilities.results.SuccessDataResult;
import demo.hrms.core.utilities.results.SuccessResult;
import demo.hrms.dataAccess.abstracts.JobAdDao;
import demo.hrms.entities.concretes.JobAd;
import demo.hrms.entities.dtos.JobAdAddDto;
import demo.hrms.entities.dtos.JobAdGetDto;

@Service
public class JobAdManager implements JobAdService{

	private JobAdDao jobAdDao;
	private ModelMapper modelMapper;
	
	@Autowired
	public JobAdManager(JobAdDao jobAdDao,ModelMapper modelMapper) {
		super();
		this.jobAdDao = jobAdDao;
		this.modelMapper=modelMapper;
	}

	@Override
	public DataResult<List<JobAdGetDto>> getAll() {
		
		return new SuccessDataResult<List<JobAdGetDto>>(this.jobAdDao.findAll().stream().map(element->modelMapper.map(element, JobAdGetDto.class)).collect(Collectors.toList()),"Tüm iş ilanları listelendi");
	}

	

	@Override
	public Result add(JobAdAddDto jobAdAddDto) {
		JobAd jobAd=modelMapper.map(jobAdAddDto, JobAd.class);
		this.jobAdDao.save(jobAd);
		return new SuccessResult("İş ilanı açıldı");
	}

	@Override
	public DataResult<List<JobAdGetDto>> findJobAdByIsActiveOrderByDeadline() {
		
		return new SuccessDataResult<List<JobAdGetDto>>(this.jobAdDao.findJobAdByIsActiveOrderByDeadline(true).stream().map(element->modelMapper.map(element, JobAdGetDto.class)).collect(Collectors.toList()),"Aktif iş ilanları tarihe göre sıralandı.");
	}

	@Override
	public DataResult<List<JobAdGetDto>> findJobAdByIsActiveAndEmployer_CompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdGetDto>>(this.jobAdDao.findJobAdByIsActiveAndEmployer_CompanyName(true,companyName).stream().map(element->modelMapper.map(element, JobAdGetDto.class)).collect(Collectors.toList()),"Firmanın tüm aktif iş lanları listelendi.");
	}

}
