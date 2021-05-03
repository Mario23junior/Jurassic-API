package com.project.jurassic.Controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
	public Dinossauro save(@RequestBody @Valid Dinossauro dinossauro) {
 	    return repositoryDinossauro.save(dinossauro);
	}
	
	@GetMapping("/{id}")
 	public Dinossauro listById(@PathVariable Long id) {
		return repositoryDinossauro
				         .findById(id)
				         .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Id de usuario não encontrado"));
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		   repositoryDinossauro
				   .findById(id)
				   .map(delete -> {
					   repositoryDinossauro.delete(delete);
					   return delete;
				   }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhum id foi encontrado para deleta"));
	}
	
	@PutMapping("/{id}")
 	public void update(@PathVariable Long id, @RequestBody @Valid Dinossauro dinossauro) {
		   repositoryDinossauro
		                   .findById(id)
		                   .map(updateDate -> {
		                	   dinossauro.setId(updateDate.getId());
		                	   repositoryDinossauro.save(dinossauro);
		                	   return updateDate;
		                   }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhum id foi encontrado para atualizar"));
	}
	
}