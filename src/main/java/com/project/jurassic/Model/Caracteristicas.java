package com.project.jurassic.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Caracteristicas {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "{campo.classCientifica.habitat}")
	private String habitat;
	
	@NotEmpty(message = "{campo.classCientifica.alimento}")
	private String alimento;
	
	@Column(length = 700)
	@NotEmpty(message = "{campo.classCientifica.definicao}")
	private String definicao;
	
	@Column(length = 700)
 	@NotEmpty(message = "{campo.classCientifica.curiosidade}")
	private String curiosidade;

	@ManyToOne
	private Dinossauro dinossauro;

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
    
	@JsonIgnore
	public Dinossauro getDinossauro() {
		return dinossauro;
	}

	public void setDinossauro(Dinossauro dinossauro) {
		this.dinossauro = dinossauro;
	}
}
