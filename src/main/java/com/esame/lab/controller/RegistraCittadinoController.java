package com.esame.lab.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.repository.CittadiniRegistratiRepository;











/**
 * 
 * 
 *  RegistraCittadinoController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 * @author Eric Marins
 *
 */



@Controller
public class RegistraCittadinoController {
	
	@Autowired
	CittadiniRegistratiRepository cittadinirepository;
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata del server.
	 * @return registracittadino.html
	 */
	@GetMapping("/registracittadino")
	public String registraCittadino() {
		return "registracittadino";
	}
	
	
	/**
	 * il seguente metodo gestisce una request di tipo POST viene utilizzato per inviare dati
	 *  al server per creare/aggiornare una risorsa, i dati vengono acquisiti da un form lato client 
	 *  che registra i dati relativi ai cittadini , inoltre il metodo 
	 *  registra i dati su un file txt.
	 *  
	 * @param nome
	 * @param codiceFiscale
	 * @param email
	 * @param userId
	 * @param password
	 * @param idUnivoco
	 * @return registracittadino.html
	 * @throws IOException
	 * @throws IOException
	 */
	@PostMapping("/registracittadino")
	public String registra(@RequestParam(name="nome") String nome,@RequestParam(name="codiceFiscale") String codiceFiscale,@RequestParam(name="email") String email,@RequestParam(name="userId") String userId,@RequestParam(name="password") String password,@RequestParam(name="idUnivoco") String idUnivoco) throws IOException, IOException {
		System.out.println("folder "+ nome);
		System.out.println("User Id"+userId);
		System.out.println("Password"+ password);
		CittadiniRegistrati newCittadino = new CittadiniRegistrati(null, nome,codiceFiscale,email,userId ,password, idUnivoco);
		cittadinirepository.save(newCittadino);
		
		

		File f = new File("Cittadini_Registrati.dati.txt");
		
		
		if(f.exists()) {
			FileOutputStream fos = new FileOutputStream("Cittadini_Registrati.dati.txt",true);
			PrintWriter scrivi = new PrintWriter(fos);
			scrivi.append(nome+", "+codiceFiscale+", "+email+", "+userId +", "+password+", "+ idUnivoco+"\n");
			scrivi.close();
		}
		else if(f.createNewFile()){
			
			PrintWriter scrivi = new PrintWriter(f);
			scrivi.println(nome+", "+codiceFiscale+", "+email+userId +", "+password+ ", "+idUnivoco+"\n");
			scrivi.close();
		}
		
		
		
		
		return"registracittadino";
	}
}
