package com.project.jurassic.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Entity
public class Dinossauro {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "{campo.dino.nome}")
	private String Nome;
	
	@Max(78231)
	private Double Comprimento;
	
	@Max(78231)
	private Double Peso;
	
	@Max(78231)
	private Double Altura;
	
	@ManyToOne
	@JoinColumn(name = "caracteristicas_id")
	private Caracteristicas caracteristicas;
	
	@ManyToOne
	@JoinColumn(name = "classificacaoCientificas_id")
	private ClassificacaoCientifica classificacaoCientificas;
	
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getComprimento() {
		return Comprimento;
	}

	public void setComprimento(Double comprimento) {
		Comprimento = comprimento;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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

	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public ClassificacaoCientifica getClassificacaoCientificas() {
		return classificacaoCientificas;
	}

	public void setClassificacaoCientificas(ClassificacaoCientifica classificacaoCientificas) {
		this.classificacaoCientificas = classificacaoCientificas;
	}
	
	

	
	
	
}
