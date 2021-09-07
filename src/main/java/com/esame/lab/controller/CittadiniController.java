package com.esame.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CittadiniController {

	@GetMapping("/cittadini")
	public String home() {
		return "cittadini";
	}
}
