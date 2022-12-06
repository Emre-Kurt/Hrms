package demo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.hrms.business.abstracts.JobAdService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.dtos.JobAdAddDto;
import demo.hrms.entities.dtos.JobAdGetDto;

@RestController
@RequestMapping("/api/jobAds")
public class JobAdController {

	 private JobAdService jobAdService;

	@Autowired
	public JobAdController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@GetMapping("/getall")
    public DataResult<List<JobAdGetDto>> getAll(){
        return this.jobAdService.getAll();
    }
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdAddDto jobAdAddDto) {
		return this.jobAdService.add(jobAdAddDto);
	}
	@GetMapping("/getActiveOrderByDeadline")
	public DataResult<List<JobAdGetDto>> findJobAdByIsActiveOrderByDeadline(){
		return this.jobAdService.findJobAdByIsActiveOrderByDeadline();
	}
	@GetMapping("/findByIsActiveAndEmployer_CompanyName")
	public DataResult<List<JobAdGetDto>> findByIsActiveAndEmployer_CompanyName(String companyName){
		return this.jobAdService. findJobAdByIsActiveAndEmployer_CompanyName(companyName);
	}
}
