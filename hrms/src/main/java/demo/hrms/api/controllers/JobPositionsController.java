package demo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import demo.hrms.business.abstracts.JobPositionService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/ispozisyonu")
public class JobPositionsController {

	private JobPositionService jobPositionService;
	
    @Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
    
    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
    	
    	return this.jobPositionService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition)
    {
    	return this.jobPositionService.add(jobPosition);
    }
}