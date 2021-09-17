package com.esame.lab.domain;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * UserPrincipal  è la classe che fornisce i metodi per accedere ai dati utili all'applicazione
 * @author Eric Marins
 *
 */

public class UserPrincipal implements UserDetails {
	

	
	
	/**
	 * serialVersionUID,  viene utilizzato durante la deserializzazione
	 *  per verificare che il mittente e il destinatario di un oggetto serializzato
	 *   abbiano caricato classi per quell'oggetto compatibili 
	 *  rispetto alla serializzazione. 
	 */
	private static final long serialVersionUID = 1L;
	private CittadiniRegistrati cittadini;
	
	
/**
 * Metodo Costruttore della classe
 * @param cittadini
 */
	public UserPrincipal(CittadiniRegistrati cittadini) {
		
		this.cittadini = cittadini;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return cittadini.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return cittadini.getUserId();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
