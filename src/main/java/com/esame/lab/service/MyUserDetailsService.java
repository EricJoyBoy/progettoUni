package com.esame.lab.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.domain.UserPrincipal;
import com.esame.lab.repository.CittadiniRegistratiRepository;

/**
 * MyUserDetailsService è una classe costruita 
 * con lo scopo  di archiviare, recuperare, aggiornare ed eliminare le risorse del progetto
 * @author Eric Marins
 *
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

	/**
	 * l'attributo permette la dependency injection permette di instanziare e passare 
	 * oggetti in modo esplicito
	 */
	@Autowired CittadiniRegistratiRepository cittadini;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		CittadiniRegistrati user = cittadini.findByUserId(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		
		return new UserPrincipal(user);
}
}
