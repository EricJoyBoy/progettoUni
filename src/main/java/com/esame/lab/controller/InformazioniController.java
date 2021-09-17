package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.esame.lab.service.CentriVaccinaliService;
import com.esame.lab.service.EventiAvversiService;



/**
 * InformazioniController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 */
@Controller
public class InformazioniController {


	
	@Autowired private EventiAvversiService eventiAvversiService;
	
	@Autowired	private CentriVaccinaliService centriVaccinaliService;
	
	
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata, in questo caso si richiede al server
	 * tramite la struttura condizionale if si sceglie quali dati richiedere al server
	 * se il parametro keyword è diverso da null il server restituira i dati scremati dal parametro 
	 * keyword, altrimenti restituira l' intera lista di dati riguardo i centri vaccinali.
	 * @param model
	 * @param keyword
	 * @return informazioni.html
	 */
	@GetMapping("/informazioni")
	public String informazioni(Model model, String keyword) {
		if(keyword != null){
			model.addAttribute("centrivaccinali", centriVaccinaliService.findByKeyword(keyword));
		}
		else 
		{
		     model.addAttribute("centrivaccinali", centriVaccinaliService.getCentriVaccinali());			
		}
		
		
		return "informazioni";
	}
	
	/**
	 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata, in questo caso si richiede al server
	 * tramite la struttura condizionale if si sceglie quali dati richiedere al server
	 * se il parametro Centro è diverso da null il server restituira i dati scremati dal parametro 
	 * Centro, altrimenti restituira l' intera lista di dati riguardo gli eventi avversi.
	 * @param model
	 * @param Centro
	 * @return informazioni.html
	 */
	@GetMapping("/informazioni2")
	public String informazioni2(Model model,String Centro) {
		if(Centro!=null) {
			model.addAttribute("eventiAvversi", eventiAvversiService.findByCentro(Centro));
		}
		else
		{
			
			 model.addAttribute("eventiAvversi", eventiAvversiService.getEventiAvversi());
		}
		return "informazioni2";
	}
	
	

	}	

