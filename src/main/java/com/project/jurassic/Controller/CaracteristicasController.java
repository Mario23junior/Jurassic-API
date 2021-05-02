package com.project.jurassic.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jurassic.Repository.RepositoryCaracteristicas;

@RestController
@RequestMapping("/v1/api/caracteristicas")
public class CaracteristicasController {
   
	private RepositoryCaracteristicas repositoryCaracteristicas;
	
	public CaracteristicasController(RepositoryCaracteristicas repositoryCaracteristicas) {
		 this.repositoryCaracteristicas = repositoryCaracteristicas;
 	}
	
	
}
