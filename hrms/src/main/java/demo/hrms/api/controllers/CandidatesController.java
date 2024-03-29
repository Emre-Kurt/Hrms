package demo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.hrms.business.abstracts.CandidateService;
import demo.hrms.core.utilities.results.DataResult;
import demo.hrms.core.utilities.results.Result;
import demo.hrms.entities.concretes.Candidate;

@RequestMapping("/api/candidates")
@RestController
public class CandidatesController {

	private CandidateService candidateService;
	
    @Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
}
