package com.esame.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esame.lab.domain.EventiAvversi;
import com.esame.lab.repository.EventiAvversiRepository;
import com.esame.lab.service.CentriVaccinaliService;

@Controller
public class EventiAvversiController {

	
	@Autowired	private CentriVaccinaliService centriVaccinaliService;
	
	@Autowired
	EventiAvversiRepository eventirepository;
	
	
	@GetMapping("/eventiavversi")
	public String eventiavversi(Model model) {
		 model.addAttribute("centrivaccinali", centriVaccinaliService.getCentriVaccinali());	
		return "eventiavversi";
	}
	
	@GetMapping("/eventiavversi2")
	public String eventiavversi2() {
		return "eventiavversi2";
	}
	
	@PostMapping("/eventiavversi2")
	public String registra(@RequestParam(name="evento") String evento,@RequestParam(name="severita") String severita,@RequestParam(name="noteOpzionali") String noteOpzionali) {
		System.out.println("folder "+ evento);
		EventiAvversi newEvento = new EventiAvversi(null, evento,severita,noteOpzionali );
		eventirepository.save(newEvento);
		return"eventiavversi2";
	}
	
}
