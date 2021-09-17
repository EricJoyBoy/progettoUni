package com.esame.lab.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.VaccinatiRegistrati;
import com.esame.lab.repository.VaccinatiRegistratiRepository;
import com.esame.lab.service.CentriVaccinaliService;




/**
 *  RegistraVaccinatoController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 * @author Eric Marins
 *
 */

@Controller
public class RegistraVaccinatoController {

	@Autowired VaccinatiRegistratiRepository vaccinatirepository;
	@Autowired	private CentriVaccinaliService centriVaccinaliService;
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata del server.
	 * @return registravaccinato.html
	 */
	@GetMapping("/registravaccinato")
	public String registravaccinato(Model model) {
		model.addAttribute("centrivaccinali", centriVaccinaliService.getCentriVaccinali());	
		return "registravaccinato";
	}
	/**
	 * il seguente metodo gestisce una request di tipo POST viene utilizzato per inviare dati
	 *  al server per creare/aggiornare una risorsa, i dati vengono acquisiti da un form lato client 
	 *  che registra i dati relativi ai vaccinati , inoltre il metodo 
	 *  registra i dati su un file txt.
	 * @param nomeCentro
	 * @param nome
	 * @param codiceFiscale
	 * @param data
	 * @param vaccino
	 * @param idUnivoco
	 * @return registravaccinato.html
	 * @throws IOException
	 */
	@PostMapping("/registravaccinato")
	public String registra(@RequestParam(name="nomeCentro") String nomeCentro,@RequestParam(name="nome") String nome,@RequestParam(name="codiceFiscale") String codiceFiscale,@RequestParam(name="data") String data,@RequestParam(name="vaccino") String vaccino,@RequestParam(name="idUnivoco") String idUnivoco) throws IOException {
		
		
		VaccinatiRegistrati newVaccinato = new VaccinatiRegistrati(null, nome,nomeCentro,codiceFiscale,data ,vaccino, idUnivoco);
		vaccinatirepository.save(newVaccinato);
		

		File f = new File("Vaccinati_NomeCentroVaccinale.dati.txt");
		
		
		if(f.exists()) {
			FileOutputStream fos = new FileOutputStream("Vaccinati_NomeCentroVaccinale.dati.txt",true);
			PrintWriter scrivi = new PrintWriter(fos);
			scrivi.append( nome  +", "+ nomeCentro +", "+ codiceFiscale +", "+ data + ", "+ vaccino+ ", "+idUnivoco+"\n");
			scrivi.close();
		}
		else if(f.createNewFile()){
			
			PrintWriter scrivi = new PrintWriter(f);
			scrivi.println( nome  +", "+ nomeCentro +", "+ codiceFiscale +", "+ data + ", "+ vaccino+ ", "+idUnivoco+"\n");
			scrivi.close();
		}
		
		return"centrivaccinali";
	}
}
