package com.project.jurassic.ModelDTO;

public class DiossauroDTO {
   
	private Long id;
 	private String Nome;
 	private Double Comprimento;
 	private Double Peso;
 	private Double Altura;
 	private CaracteristicasDTO caracteristicasDTO;
 	private ClassificacaoCientificaDTO classificacaoCientificaDTO;
 	
 	
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
	public CaracteristicasDTO getCaracteristicasDTO() {
		return caracteristicasDTO;
	}
	public void setCaracteristicasDTO(CaracteristicasDTO caracteristicasDTO) {
		this.caracteristicasDTO = caracteristicasDTO;
	}
	public ClassificacaoCientificaDTO getClassificacaoCientificaDTO() {
		return classificacaoCientificaDTO;
	}
	public void setClassificacaoCientificaDTO(ClassificacaoCientificaDTO classificacaoCientificaDTO) {
		this.classificacaoCientificaDTO = classificacaoCientificaDTO;
	}
 
}
