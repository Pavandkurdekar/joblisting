package com.Pavan.CrudProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Pavan.CrudProject.model.JobModel;
import com.Pavan.CrudProject.repository.PostRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class PostJobsController 
{

	
	
	@Autowired
	private PostRepository PostRepo;
	
	
	
	@PostMapping("/postjob")
	JobModel postjobs(@RequestBody JobModel newpost)
	{
		return PostRepo.save(newpost);
	}
	
	
	@GetMapping("/getalljobs")
		List<JobModel> getalljobs()
		{
			return PostRepo.findAll();
		}
	
	@GetMapping("/searchjobs")
    public List<JobModel> searchJobs(@RequestParam String profile) {
        // Perform a case-insensitive search by job profile
        return PostRepo.findByProfileContainingIgnoreCase(profile);
    }
	
	
	
	}
	
	
	

