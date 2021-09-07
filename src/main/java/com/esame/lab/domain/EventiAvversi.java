package com.esame.lab.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class EventiAvversi implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String evento;
	private String Severita;
	private String noteOpzionali;
	
	
	
	public EventiAvversi(Integer id, String evento, String severita, String noteOpzionali) {
		super();
		this.id = id;
		this.evento = evento;
		this.Severita = severita;
		this.noteOpzionali = noteOpzionali;
	}


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
