package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.CentriVaccinali;

import com.esame.lab.repository.CentriVaccinaliRepository;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;




/**
 *  RegistraCentroController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 * @author Eric Marins
 *
 */

@Controller
public class RegistraCentroController {
	
	
	@Autowired
	CentriVaccinaliRepository centrorepository ;
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata del server.
	 * @return registracentro.html
	 */
	@GetMapping("/registracentro")
	public String registraCittadino() {
		return "registracentro";
	}
	/**
	 * 
	 * il seguente metodo gestisce una request di tipo POST viene utilizzato per inviare dati
	 *  al server per creare/aggiornare una risorsa, i dati vengono acquisiti da un form lato client 
	 *  che registra i dati relativi ai centri vaccinali , inoltre il metodo 
	 *  registra i dati su un file txt.
	 * 
	 * 
	 * @param nomeCentro
	 * @param qualificatore
	 * @param nome
	 * @param numeroCivico
	 * @param comune
	 * @param siglaProvincia
	 * @param cap
	 * @param tipologia
	 * @return registracentro.html
	 * @throws IOException
	 */
	@PostMapping("/registracentro")
	public String registra(@RequestParam(name="nomeCentro") String nomeCentro,@RequestParam(name="qualificatore") String qualificatore,@RequestParam(name="nome") String nome,@RequestParam(name="numeroCivico") String numeroCivico,@RequestParam(name="comune") String comune,@RequestParam(name="siglaProvincia") String siglaProvincia,@RequestParam(name="cap") String cap,@RequestParam(name="tipologia") String tipologia) throws IOException {
		System.out.println("folder "+ nomeCentro);
		CentriVaccinali newCentro = new CentriVaccinali(null, nomeCentro,qualificatore,nome,numeroCivico ,comune, siglaProvincia,cap,tipologia);
		centrorepository.save(newCentro);
		
		
		File f = new File("CentriVaccinali.dati.txt");
		
		
		if(f.exists()) {
			FileOutputStream fos = new FileOutputStream("CentriVaccinali.dati.txt",true);
			PrintWriter scrivi = new PrintWriter(fos);
			scrivi.append(nomeCentro+", "+qualificatore+nome+numeroCivico +", "+comune+ ", "+siglaProvincia+", "+cap+tipologia+"\n");
			scrivi.close();
		}
		else if(f.createNewFile()){
			
			PrintWriter scrivi = new PrintWriter(f);
			scrivi.println(nomeCentro+", "+qualificatore+nome+numeroCivico +", "+comune+ ", "+siglaProvincia+", "+cap+tipologia);
			scrivi.close();
		}
		
		
		
		return"registracentro";
	}
	
}
