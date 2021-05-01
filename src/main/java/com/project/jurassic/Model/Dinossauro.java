package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dinossauro {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Nome;
	
	private String Comprimento;
	
	private Double Peso;
	
	private Double Altura;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getComprimento() {
		return Comprimento;
	}

	public void setComprimento(String comprimento) {
		Comprimento = comprimento;
	}

	public Double getPeso() {
		return Peso;
	}

	public void setPeso(Double peso) {
		Peso = peso;
	}

	public Double getAltura() {
		return Altura;
	}

	public void setAltura(Double altura) {
		Altura = altura;
	}
	

	
	
	
}
