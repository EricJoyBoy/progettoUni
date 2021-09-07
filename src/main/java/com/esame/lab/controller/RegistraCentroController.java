package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.CentriVaccinali;

import com.esame.lab.repository.CentriVaccinaliRepository;


@Controller
public class RegistraCentroController {
	
	@Autowired
	CentriVaccinaliRepository centrorepository ;
	
	
	@GetMapping("/registracentro")
	public String registraCittadino() {
		return "registracentro";
	}
	
	@PostMapping("/registracentro")
	public String registra(@RequestParam(name="nomeCentro") String nomeCentro,@RequestParam(name="qualificatore") String qualificatore,@RequestParam(name="nome") String nome,@RequestParam(name="numeroCivico") String numeroCivico,@RequestParam(name="comune") String comune,@RequestParam(name="siglaProvincia") String siglaProvincia,@RequestParam(name="cap") String cap,@RequestParam(name="tipologia") String tipologia) {
		System.out.println("folder "+ nomeCentro);
		CentriVaccinali newCentro = new CentriVaccinali(null, nomeCentro,qualificatore,nome,numeroCivico ,comune, siglaProvincia,cap,tipologia);
		centrorepository.save(newCentro);
		return"registracentro";
	}
	
}
