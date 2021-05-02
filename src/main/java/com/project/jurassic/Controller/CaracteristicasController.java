package com.project.jurassic.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.jurassic.Model.Caracteristicas;
import com.project.jurassic.Repository.RepositoryCaracteristicas;

@RestController
@RequestMapping("/v1/api/caracteristicas")
public class CaracteristicasController {
   
	private RepositoryCaracteristicas repositoryCaracteristicas;
	
	public CaracteristicasController(RepositoryCaracteristicas repositoryCaracteristicas) {
		 this.repositoryCaracteristicas = repositoryCaracteristicas;
 	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Caracteristicas save(@RequestBody Caracteristicas caracteristicas) {
		return repositoryCaracteristicas.save(caracteristicas);
	}
	
}