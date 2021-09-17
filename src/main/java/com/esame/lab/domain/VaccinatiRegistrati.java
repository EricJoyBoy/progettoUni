package com.esame.lab.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/*
 * VaccinatiRegistrati  è la classe che fornisce i metodi per accedere ai dati utili all'applicazione
 * @author Eric Marins
 * 
 */

@Entity
public class VaccinatiRegistrati implements Serializable{

	/**
	 * serialVersionUID,  viene utilizzato durante la deserializzazione
	 *  per verificare che il mittente e il destinatario di un oggetto serializzato
	 *   abbiano caricato classi per quell'oggetto compatibili 
	 *  rispetto alla serializzazione. 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * L'attributo Id ci permette di riconoscere in
	 * maniera univoca il centro vaccinale
	 *  viene annotato cosi da essere riconosciuto da JPA
	 *  come ID del nostro oggetto
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	/**
	 * Identifica il nome del centro
	 */
	private String  nomeCentro;
	/**
	 * identifica il nome del centro vaccinale
	 */
	private String nome;
	/**
	 * identifica il codice fiscale del cittadino
	 */
	private String codiceFiscale;
	/**
	 * identifica la data si somministrazione dell vaccino
	 */
	private String data;
	/**
	 * identfica quale vaccino è stato somministrato al paziente
	 */
	private String vaccino;
	/**
	 * identifica l' id univoco del paziente vaccinato
	 */
	private String idUnivoco;
	
	
	/**
	 * Costruttore con tutti i parametri
	 * @param id
	 * @param nomeCentro
	 * @param nome
	 * @param codiceFiscale
	 * @param data
	 * @param vaccino
	 * @param idUnivoco
	 */
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
/**
 * Costruttore vuoto
 */
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
