package com.project.jurassic.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
	public Caracteristicas save(@RequestBody @Valid Caracteristicas caracteristicas) {
		return repositoryCaracteristicas.save(caracteristicas);
	}
	
	@GetMapping("/{id}")
 	public Optional<Caracteristicas> listById(@PathVariable Long id) {
		      Optional<Caracteristicas> list = Optional.of(repositoryCaracteristicas
		    		                        .findById(id)
		    		                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhum id foi encontrado")));
		return list;
	}
	
	
	@GetMapping("/alimento")
	List<Caracteristicas> listHabitat(@RequestParam(name = "alimento") String alimento){
		return repositoryCaracteristicas.findByAlimentoIgnoreCaseContaining(alimento);
	}
	
	@DeleteMapping("/{id}")
 	public void delete(@PathVariable Long id) {
		 repositoryCaracteristicas
		            .findById(id)
		            .map(delete -> {
		            	repositoryCaracteristicas.delete(delete);
		            	return delete;
		            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhum id encontrado para ser deletado"));
	}

	
	@PutMapping("/{id}")
	public void update(@RequestBody @Valid Caracteristicas caracteristicas, @PathVariable Long id) {
		 repositoryCaracteristicas
		                  .findById(id)
		                  .map(update -> {
		                	  caracteristicas.setId(update.getId());
		                	  repositoryCaracteristicas.save(caracteristicas);
		                	  return update;
		                  }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhum id para ser deletado"));
	}
	
	
	
}