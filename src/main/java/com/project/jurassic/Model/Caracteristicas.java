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
	
	private String habitat;
	
	private String alimento;
	
	private String definicao;
	
	private String curiosidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getDefinicao() {
		return definicao;
	}

	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}

	public String getCuriosidade() {
		return curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}
}
