package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.esame.lab.service.CentriVaccinaliService;

@Controller
public class InformazioniController {

	
	
	@Autowired	private CentriVaccinaliService centriVaccinaliService;
	
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
	

	}	

