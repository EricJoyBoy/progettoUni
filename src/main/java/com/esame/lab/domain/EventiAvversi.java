package com.esame.lab.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * EventiAvversi è la classe che fornisce i metodi per accedere ai dati utili all'applicazione
 * @author Eric Marins
 *
 */
@Entity
public class EventiAvversi implements Serializable {
	
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
	 * identifica l'evento avverso
	 */
	private String evento;
	/**
	 * identifica la severita dell'evento
	 */
	private String Severita;
	/**
	 * identifica le note opzionali
	 */
	private String noteOpzionali;
	/**
	 * identifica il centro vaccinale
	 */
	private String Centro;
	
	/**
	 * Costruttore con tutti i parametri
	 * @param id
	 * @param evento
	 * @param severita
	 * @param noteOpzionali
	 * @param centro
	 */
	
	public EventiAvversi(Integer id, String evento, String severita, String noteOpzionali, String centro) {
		super();
		this.id = id;
		this.evento = evento;
		Severita = severita;
		this.noteOpzionali = noteOpzionali;
		Centro = centro;
	}


	public String getCentro() {
		return Centro;
	}


	public void setCentro(String centro) {
		Centro = centro;
	}


	public EventiAvversi(Integer id, String evento, String severita, String noteOpzionali) {
		super();
		this.id = id;
		this.evento = evento;
		this.Severita = severita;
		this.noteOpzionali = noteOpzionali;
	}

/**
 * Costruttore vuoto
 */
	public EventiAvversi() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEvento() {
		return evento;
	}


	public void setEvento(String evento) {
		this.evento = evento;
	}


	public String getSeverita() {
		return Severita;
	}


	public void setSeverita(String severita) {
		Severita = severita;
	}


	public String getNoteOpzionali() {
		return noteOpzionali;
	}


	public void setNoteOpzionali(String noteOpzionali) {
		this.noteOpzionali = noteOpzionali;
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
		EventiAvversi other = (EventiAvversi) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
	
}
