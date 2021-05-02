package com.project.jurassic.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.jurassic.Model.Dinossauro;
import com.project.jurassic.Repository.RepositoryDinossauro;

@RequestMapping("/v1/api/dinossauro")
@RestController
public class DinossauroController {
   
	private RepositoryDinossauro repositoryDinossauro;
	
	public DinossauroController(RepositoryDinossauro repositoryDinossauro) {
		this.repositoryDinossauro = repositoryDinossauro;
 	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Dinossauro save(@RequestBody Dinossauro dinossauro) {
 	    return repositoryDinossauro.save(dinossauro);
	}
}
