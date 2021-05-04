package com.project.jurassic.ControllersDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jurassic.ModelDTO.DinossauroDTO;
import com.project.jurassic.Service.ServiceDTOImplements;

@RestController
@RequestMapping("/v1/api/data")
public class ControllersDTO {
   
	private ServiceDTOImplements listAll;
	
	public ControllersDTO(ServiceDTOImplements listAll) {
		this.listAll = listAll;
 	}
	
	@GetMapping("/list")
	public List<DinossauroDTO> listAllDataDTO() {
		     List<DinossauroDTO> list = listAll.listAllbyData();
		     return list
		    		  .stream()
		    		  .collect(Collectors.toList());
	}
}
