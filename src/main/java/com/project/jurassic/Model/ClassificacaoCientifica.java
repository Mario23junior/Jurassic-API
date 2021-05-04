package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
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

	@Override
	public String toString() {
		return "ClassificacaoCientifica [id=" + id + ", nomeCientifico=" + nomeCientifico + ", reino=" + reino
				+ ", familia=" + familia + ", subordem=" + subordem + "]";
	}
	
	
} 
