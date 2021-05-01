package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassificacaoCientifica {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String NomeCientifico;
	
	private String Reino;
	
	private String Familia;
	
	private String Subordem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCientifico() {
		return NomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		NomeCientifico = nomeCientifico;
	}

	public String getReino() {
		return Reino;
	}

	public void setReino(String reino) {
		Reino = reino;
	}

	public String getFamilia() {
		return Familia;
	}

	public void setFamilia(String familia) {
		Familia = familia;
	}

	public String getSubordem() {
		return Subordem;
	}

	public void setSubordem(String subordem) {
		Subordem = subordem;
	}

	
	
	
	
} 
