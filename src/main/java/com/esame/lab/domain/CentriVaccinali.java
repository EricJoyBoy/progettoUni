package com.esame.lab.domain;
import javax.persistence.*;

import java.io.Serializable;

import java.util.Objects;

/*
 * @author Eric Marins
 * 
 */

@Entity
public class CentriVaccinali implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomeCentro;
	private String qualificatore;
	private String nome;
	private String numeroCivico;
	private String comune;
	private String siglaProvincia;
	private String cap;
	private String Tipologia;
	
	
	
	
	public CentriVaccinali() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CentriVaccinali(Integer id, String nomeCentro, String qualificatore, String nome, String numeroCivico,
			String comune, String siglaProvincia, String cap, String tipologia) {
		super();
		this.id = id;
		this.nomeCentro = nomeCentro;
		this.qualificatore = qualificatore;
		this.nome = nome;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		this.siglaProvincia = siglaProvincia;
		this.cap = cap;
		this.Tipologia=tipologia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCentro() {
		return nomeCentro;
	}

	public void setNomeCentro(String nomeCentro) {
		this.nomeCentro = nomeCentro;
	}

	public String getQualificatore() {
		return qualificatore;
	}

	public void setQualificatore(String qualificatore) {
		this.qualificatore = qualificatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getTipologia() {
		return Tipologia;
	}

	public void setTipologia(String tipologia) {
		Tipologia = tipologia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CentriVaccinali other = (CentriVaccinali) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
		
}
