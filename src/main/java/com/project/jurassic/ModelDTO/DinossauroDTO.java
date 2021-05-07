package com.project.jurassic.ModelDTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id, UrlImage, Nome, Comprimento, Peso, Altura, classificacaoCientificas, caracteristicas"})
public class DinossauroDTO {
   
	private Long id;
	private String UrlImage;
	private String Nome;	
 	private Double Comprimento;
 	private Double Peso;
 	private Double Altura;
	
  	private List<CaracteristicasDTO> caracteristicas;
	
 	private List<ClassificacaoCientificaDTO> classificacaoCientificas;
 	
	public Long getId() {
		return id;
	}
	
	public String getUrlImage() {
		return UrlImage;
	}
	
	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
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

	public List<CaracteristicasDTO> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(List<CaracteristicasDTO> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public List<ClassificacaoCientificaDTO> getClassificacaoCientificas() {
		return classificacaoCientificas;
	}

	public void setClassificacaoCientificas(List<ClassificacaoCientificaDTO> classificacaoCientificas) {
		this.classificacaoCientificas = classificacaoCientificas;
	}
	
	
 
 
}
