package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({"id, nomeCientifco, reino, familia, subordem, dinossauro"})
public class ClassificacaoCientifica {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "{campo.classCientifica.nomeCient}")
	private String nomeCientifico;
	
	@NotEmpty(message = "{campo.classCientifica.reino}")
	private String reino;
	
	@NotEmpty(message = "{campo.classCientifica.familia}")
	private String familia;
	
	@NotEmpty(message = "{campo.classCientifica.subordem}")
	private String subordem;
    
	@ManyToOne
 	private Dinossauro dinossauro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
    
	@JsonIgnore
	public Dinossauro getDinossauro() {
		return dinossauro;
	}
    
 	public void setDinossauro(Dinossauro dinossauro) {
		this.dinossauro = dinossauro;
	}
} 
