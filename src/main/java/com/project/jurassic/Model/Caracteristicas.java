package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caracteristicas {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Habitat;
	
	private String Alimento;
	
	private String Definicao;
	
	private String Curiosidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHabitat() {
		return Habitat;
	}

	public void setHabitat(String habitat) {
		Habitat = habitat;
	}

	public String getAlimento() {
		return Alimento;
	}

	public void setAlimento(String alimento) {
		Alimento = alimento;
	}

	public String getDefinicao() {
		return Definicao;
	}

	public void setDefinicao(String definicao) {
		Definicao = definicao;
	}

	public String getCuriosidade() {
		return Curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		Curiosidade = curiosidade;
	}
	
	
	
}
