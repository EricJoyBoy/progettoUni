package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.CittadiniRegistrati;
import com.esame.lab.repository.CittadiniRegistratiRepository;

@Controller
public class RegistraCittadinoController {
	
	@Autowired
	CittadiniRegistratiRepository cittadinirepository;
	
	
	@GetMapping("/registracittadino")
	public String registraCittadino() {
		return "registracittadino";
	}
	
	@PostMapping("/registracittadino")
	public String registra(@RequestParam(name="nome") String nome,@RequestParam(name="codiceFiscale") String codiceFiscale,@RequestParam(name="email") String email,@RequestParam(name="userId") String userId,@RequestParam(name="password") String password,@RequestParam(name="idUnivoco") String idUnivoco) {
		System.out.println("folder "+ nome);
		System.out.println("User Id"+userId);
		System.out.println("Password"+ password);
		CittadiniRegistrati newCittadino = new CittadiniRegistrati(null, nome,codiceFiscale,email,userId ,password, idUnivoco);
		cittadinirepository.save(newCittadino);
		return"registracittadino";
	}
}
