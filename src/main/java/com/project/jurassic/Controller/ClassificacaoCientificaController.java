package com.project.jurassic.Controller;

import java.util.List;

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
	
	@GetMapping("/{id}")
	public ClassificacaoCientifica listById(@PathVariable Long id) {
		return repositoryClassificacaoCientifica
		                       .findById(id)
		                       .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"id não encontrado"));
	}
	
	@GetMapping("/familia")
		public  List<ClassificacaoCientifica> listByFamilia(@RequestParam(name = "familia") String familia) {
		return repositoryClassificacaoCientifica.findByFamiliaIgnoreCaseContaining(familia);	
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		  repositoryClassificacaoCientifica
		                      .findById(id)
		                      .map(delete -> {
		                    	  repositoryClassificacaoCientifica.delete(delete);
		                    	  return delete;
		                      }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informação encontrada para ser deletada"));
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id , @RequestBody ClassificacaoCientifica classificacaoCientifica ) {
		 repositoryClassificacaoCientifica 
		                       .findById(id)
		                       .map(update -> {
		                    	   classificacaoCientifica.setId(update.getId());
		                    	   repositoryClassificacaoCientifica.save(classificacaoCientifica);
		                    	   return update;
		                       }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhum id foi encontrado"));
	}
}
 