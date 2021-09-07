package com.esame.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CentriVaccinaliController {

	@GetMapping("/centrivaccinali")
	public String centrivaccinali() {
		return "centrivaccinali";
	}
}
