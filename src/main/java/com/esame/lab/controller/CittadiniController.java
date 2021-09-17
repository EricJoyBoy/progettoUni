package com.esame.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Eric Marins
 *
 *CittadiniController  è una classe con diversi metodi, ognuno dei quali è associato ad un diverso indirizzo URL. 
 *Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 */
@Controller
public class CittadiniController {
/**
 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
 * richiedere dati da un risorsa specificata del server.
 * @return cittadini.html
 */
	@GetMapping("/cittadini")
	public String home() {
		return "cittadini";
	}
}
