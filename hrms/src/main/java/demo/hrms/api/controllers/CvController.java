package demo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.hrms.business.abstracts.CvService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.dtos.CvAddDto;
import demo.hrms.entities.dtos.CvGetDto;

@RestController
@RequestMapping("/api/cvs")
public class CvController {

	private CvService cvService;

	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvGetDto>> getAll(){
		return this.cvService.getAll();
}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvAddDto cvAddDto) {
		return this.cvService.add(cvAddDto);
	}
	
	
	
}
