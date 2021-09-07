package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.VaccinatiRegistrati;
import com.esame.lab.repository.VaccinatiRegistratiRepository;


@Controller
public class RegistraVaccinatoController {

	@Autowired VaccinatiRegistratiRepository vaccinatirepository;
	
	
	
	@GetMapping("/registravaccinato")
	public String registravaccinato() {
		return "registravaccinato";
	}
	@PostMapping("/registravaccinato")
	public String registra(@RequestParam(name="nomeCentro") String nomeCentro,@RequestParam(name="nome") String nome,@RequestParam(name="codiceFiscale") String codiceFiscale,@RequestParam(name="data") String data,@RequestParam(name="vaccino") String vaccino,@RequestParam(name="idUnivoco") String idUnivoco) {
		
		
		VaccinatiRegistrati newVaccinato = new VaccinatiRegistrati(null, nome,nomeCentro,codiceFiscale,data ,vaccino, idUnivoco);
		vaccinatirepository.save(newVaccinato);
		return"registravaccinato";
	}
}
