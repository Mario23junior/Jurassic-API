package com.project.jurassic.ModelDTO;

import javax.persistence.OneToOne;

import com.project.jurassic.Model.Dinossauro;

public class ClassificacaoCientificaDTO {
    
  	private String nomeCientifico;
 	private String reino;
 	private String familia;	
 	private String subordem;
 	
 	@OneToOne
 	private Dinossauro dinossauro;
 	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getReino() {
		return reino;
	}
	public void setReino(String reino) {
		this.reino = reino;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getSubordem() {
		return subordem;
	}
	public void setSubordem(String subordem) {
		this.subordem = subordem;
	}
 	
 	
}
