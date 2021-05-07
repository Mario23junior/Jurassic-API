package com.project.jurassic.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({"id, Nome, UrlImage ,Comprimento , peso, Altura"})
public class Dinossauro {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "{campo.dino.nome}")
	private String Nome;
	
	@NotEmpty(message = "{campo.dino.image}")
	private String UrlImage;
	
	@Max(78231)
	private Double Comprimento;
	
	@Max(78231)
	private Double Peso;
	
	@Max(78231)
	private Double Altura;
	
	@OneToMany(mappedBy = "dinossauro",cascade = CascadeType.ALL)
 	private List<Caracteristicas> caracteristicas;
	
	@OneToMany(mappedBy = "dinossauro",cascade = CascadeType.ALL)
 	private List<ClassificacaoCientifica> classificacaoCientificas;

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

	public String getUrlImage() {
		return UrlImage;
	}

	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}

	public Double getComprimento() {
		return Comprimento;
	}

	public void setComprimento(Double comprimento) {
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
    
	@JsonIgnore
	public List<Caracteristicas> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristicas> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
     
	@JsonIgnore
	public List<ClassificacaoCientifica> getClassificacaoCientificas() {
		return classificacaoCientificas;
	}

	public void setClassificacaoCientificas(List<ClassificacaoCientifica> classificacaoCientificas) {
		this.classificacaoCientificas = classificacaoCientificas;
	}
     
	
	
	
	
}
