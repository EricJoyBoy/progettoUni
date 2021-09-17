package com.esame.lab.domain;
import javax.persistence.*;

import java.io.Serializable;

import java.util.Objects;

/**
 * 
 * Centri Vaccinali è la classe che fornisce i metodi per accedere ai dati utili all'applicazione
 * 
 * @author Eric Marins
 *
 */

@Entity
public class CentriVaccinali implements Serializable {

	
	
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
	 * identifica il nome del centro
	 */
	private String nomeCentro;
	/**
	 * identifica il qualificatore del centro via/viale/piazza
	 */
	private String qualificatore;
	/**
	 * identifica il nome del centro
	 */
	private String nome;
	/**
	 * identifica il numero civico
	 */
	private String numeroCivico;
	/**
	 * identifica il comune
	 */
	private String comune;
	/**
	 * identifica la sigla della provincia
	 */
	private String siglaProvincia;
	/**
	 * identifica il cap 
	 */
	private String cap;
	/**
	 * identifica la tipologia
	 */
	private String Tipologia;
	
	
	
	/**
	 * costruttore vuoto
	 */
	public CentriVaccinali() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * Costruttore con tutti i parametri
 * @param id
 * @param nomeCentro
 * @param qualificatore
 * @param nome
 * @param numeroCivico
 * @param comune
 * @param siglaProvincia
 * @param cap
 * @param tipologia
 */
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
