package com.project.jurassic.Service.ImplementDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.jurassic.Model.Caracteristicas;
import com.project.jurassic.Model.ClassificacaoCientifica;
import com.project.jurassic.Model.Dinossauro;
import com.project.jurassic.ModelDTO.DinossauroDTO;
import com.project.jurassic.Repository.RepositoryDinossauro;
import com.project.jurassic.Service.ServiceDTOImplements;

@Service
public class ImplementDTO implements ServiceDTOImplements {

	 
	 private RepositoryDinossauro repositoryDinossauro;
	 
	 public ImplementDTO(RepositoryDinossauro repositoryDinossauro) {
		 this.repositoryDinossauro = repositoryDinossauro;
 	}

 	public List<DinossauroDTO> listAllbyData() {
		return ((List<Dinossauro>)
				          repositoryDinossauro
				              .findAll())
				              .stream()
				              .map(this::ConvertToDTO)
				              .collect(Collectors.toList());
				
  	}
	
	public DinossauroDTO ConvertToDTO(Dinossauro dinossauro) {
		
		DinossauroDTO dinossauroDto = new DinossauroDTO();
		dinossauroDto.setId(dinossauro.getId());
		dinossauroDto.setNome(dinossauro.getNome());
		dinossauroDto.setComprimento(dinossauro.getComprimento());
		dinossauroDto.setPeso(dinossauro.getPeso());
		dinossauroDto.setAltura(dinossauro.getAltura());
		
		ClassificacaoCientifica classificacaoCientifica = dinossauro.getClassificacaoCientificas();
		dinossauroDto.setNomeCientifico(classificacaoCientifica.getNomeCientifico());
		dinossauroDto.setReino(classificacaoCientifica.getReino());
		dinossauroDto.setFamilia(classificacaoCientifica.getFamilia());
		dinossauroDto.setSubordem(classificacaoCientifica.getSubordem());
		
		Caracteristicas caracteristicas = dinossauro.getCaracteristicas();
		dinossauroDto.setHabitat(caracteristicas.getHabitat());
		dinossauroDto.setAlimento(caracteristicas.getAlimento());
		dinossauroDto.setDefinicao(caracteristicas.getDefinicao());
		dinossauroDto.setCuriosidade(caracteristicas.getCuriosidade());
		
		
		return dinossauroDto;
		
	}

}

















