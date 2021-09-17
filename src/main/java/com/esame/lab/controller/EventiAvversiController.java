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

import com.esame.lab.domain.EventiAvversi;
import com.esame.lab.repository.EventiAvversiRepository;
import com.esame.lab.service.CentriVaccinaliService;


/**
 * EventiAvversiController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 * @author Eric Marins
 *
 */


@Controller
public class EventiAvversiController {


	
	@Autowired	private CentriVaccinaliService centriVaccinaliService;
	
	@Autowired
	EventiAvversiRepository eventirepository;
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata, in questo caso si richiede al server
	 * i dati relatvi ai centri vaccinali   
	 * @param model
	 * @return eventiavversi.html
	 */
	@GetMapping("/eventiavversi")
	public String eventiavversi(Model model) {
		 model.addAttribute("centrivaccinali", centriVaccinaliService.getCentriVaccinali());	
		return "eventiavversi";
	}
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata, in questo caso si richiede al server
	 * i dati relatvi ai centri vaccinali   
	 * @param model
	 * @return eventiavversi2.html
	 */
	@GetMapping("/eventiavversi2")
	public String eventiavversi2(Model model) {
		model.addAttribute("centrivaccinali", centriVaccinaliService.getCentriVaccinali());	
		return "eventiavversi2";
	}
	
	/**
	 * il seguente metodo gestisce una request di tipo POST viene utilizzato per inviare dati
	 *  al server per creare/aggiornare una risorsa, i dati vengono acquisiti da un form lato client 
	 *  che registra i dati relativi agli eventi avversi dati da vaccinazione covid 19, inoltre il metodo 
	 *  registra i dati su un file txt.
	 * @param evento
	 * @param severita
	 * @param noteOpzionali
	 * @param centro
	 * @return eventiavversi2.html
	 * @throws IOException
	 * @throws IOException
	 */
	@PostMapping("/eventiavversi2")
	public String registra(@RequestParam(name="evento") String evento,@RequestParam(name="severita") String severita,@RequestParam(name="noteOpzionali") String noteOpzionali,@RequestParam(name="centro") String centro) throws IOException, IOException {
		System.out.println("folder "+ evento);
		EventiAvversi newEvento = new EventiAvversi(null, evento,severita,noteOpzionali,centro );
		
		eventirepository.save(newEvento);
		
		
		File f = new File("Vaccinati_NomeCentroVaccinale.dati.txt");
		
		
		if(f.exists()) {
			FileOutputStream fos = new FileOutputStream("Vaccinati_NomeCentroVaccinale.dati.txt",true);
			PrintWriter scrivi = new PrintWriter(fos);
			scrivi.append(evento+", "+severita+", "+noteOpzionali+"\n");
			scrivi.close();
		}
		else if(f.createNewFile()){
			
			PrintWriter scrivi = new PrintWriter(f);
			scrivi.println(evento+", "+severita+", "+noteOpzionali+"\n");
			scrivi.close();
		}
		
		
		
		
		
		return"home";
	}
	
	
	
}
