package com.esame.lab.domain;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/*
 * @author Eric Marins
 * 
 */
@Entity
public class CittadiniRegistrati implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String codiceFiscale;
	private String  email;
	private String  userId;
	private String password;
	private String idUnivoco;
	
	public CittadiniRegistrati() {
		super();
		// TODO Auto-generated constructor stub
	}

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
