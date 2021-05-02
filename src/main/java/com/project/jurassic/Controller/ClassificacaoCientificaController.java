package com.project.jurassic.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.jurassic.Model.ClassificacaoCientifica;
import com.project.jurassic.Repository.RepositoryClassificacaoCientifica;

@RequestMapping("/v1/api/classificacaoCientifica")
@RestController
public class ClassificacaoCientificaController {
   
	private RepositoryClassificacaoCientifica repositoryClassificacaoCientifica;

	
	public ClassificacaoCientificaController(RepositoryClassificacaoCientifica repositoryClassificacaoCientifica) {
		this.repositoryClassificacaoCientifica = repositoryClassificacaoCientifica;
 	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClassificacaoCientifica save(@RequestBody ClassificacaoCientifica classificacaoCientifica ) {
		 return repositoryClassificacaoCientifica.save(classificacaoCientifica);
	}
}
