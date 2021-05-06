package com.project.jurassic.Service.ImplementDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.jurassic.Model.Dinossauro;
import com.project.jurassic.ModelDTO.DinossauroDTO;
import com.project.jurassic.Repository.RepositoryDinossauro;
import com.project.jurassic.Service.ServiceDTOImplements;

@Service
public class ImplementDTO implements ServiceDTOImplements {

	 
	 private RepositoryDinossauro repositoryDinossauro;
	 
	 private ModelMapper modelMapper;
 
	 public ImplementDTO(RepositoryDinossauro repositoryDinossauro, ModelMapper modelMapper) {
		 this.repositoryDinossauro = repositoryDinossauro;
		 this.modelMapper = modelMapper;
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
 		modelMapper.getConfiguration()
 		        .setMatchingStrategy(MatchingStrategies.LOOSE);
 		           DinossauroDTO dinossauroDto = modelMapper
 			   .map(dinossauro, DinossauroDTO.class);
		return dinossauroDto;
	}
}