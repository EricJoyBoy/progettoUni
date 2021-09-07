package com.esame.lab.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/*
 * @author Eric Marins
 * 
 */

@Entity
public class VaccinatiRegistrati implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String  nomeCentro;
	private String nome;
	private String codiceFiscale;
	private String data;
	private String vaccino;
	private String idUnivoco;
	
	
	
	public VaccinatiRegistrati(Integer id, String nomeCentro, String nome, String codiceFiscale, String data,
			String vaccino, String idUnivoco) {
		super();
		this.id = id;
		this.nomeCentro = nomeCentro;
		this.nome = nome;
		this.codiceFiscale = codiceFiscale;
		this.data = data;
		this.vaccino = vaccino;
		this.idUnivoco = idUnivoco;
	}

	public VaccinatiRegistrati() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getVaccino() {
		return vaccino;
	}

	public void setVaccino(String vaccino) {
		this.vaccino = vaccino;
	}

	public String getIdUnivoco() {
		return idUnivoco;
	}

	public void setIdUnivoco(String idUnivoco) {
		this.idUnivoco = idUnivoco;
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
		VaccinatiRegistrati other = (VaccinatiRegistrati) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
}
