package com.esame.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.repository.CittadiniRegistratiRepository;


/**
 * CittadiniService è una classe costruita 
 * con lo scopo  di archiviare, recuperare, aggiornare ed eliminare le risorse del progetto
 * @author Eric Marins
 *
 */
@Service
public class CittadiniRegistratiService {

	/**
	 * l'attributo permette la dependency injection permette di instanziare e passare 
	 * oggetti in modo esplicito
	 */
@Autowired private BCryptPasswordEncoder encoder;
/**
 * l'attributo permette la dependency injection permette di instanziare e passare 
 * oggetti in modo esplicito
 */
	@Autowired private CittadiniRegistratiRepository cittadini;
	/**
	 * il seguente metodo salva un nuovo cittadino/utente dell'applicazione e ne cripta i dati relativi
	 * alla password
	 * @param user
	 */
public void save(CittadiniRegistrati user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		
		cittadini.save(user);
	}
}
