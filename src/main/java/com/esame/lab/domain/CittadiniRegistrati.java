package com.esame.lab.domain;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 *  Cittadini Registrati  è la classe che fornisce i metodi per accedere ai dati utili all'applicazione
 * @author Eric Marins
 * 
 *
 */
@Entity
public class CittadiniRegistrati implements Serializable{

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
	 * identifica il nome del cittadino
	 */
	private String nome;
	/**
	 * identifica il codice fiscale
	 */
	private String codiceFiscale;
	/**
	 * identifica l'email
	 */
	private String  email;
	/**
	 * identifica l'user id
	 */
	private String  userId;
	/**
	 * identifica la password
	 */
	private String password;
	/**
	 * identifica l' id univoco
	 */
	private String idUnivoco;
	/**
	 * Costruttore vuoto
	 */
	public CittadiniRegistrati() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * costruttore con tutti i parametri
 * @param id
 * @param nome
 * @param codiceFiscale
 * @param email
 * @param userId
 * @param password
 * @param idUnivoco
 */
	public CittadiniRegistrati(Integer id, String nome, String codiceFiscale, String email, String userId,
			String password, String idUnivoco) {
		super();
		this.id = id;
		this.nome = nome;
		this.codiceFiscale = codiceFiscale;
		this.email = email;
		this.userId = userId;
		this.password = password;
		this.idUnivoco = idUnivoco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		CittadiniRegistrati other = (CittadiniRegistrati) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
