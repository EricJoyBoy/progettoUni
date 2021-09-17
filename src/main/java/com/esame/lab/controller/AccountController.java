package com.esame.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *  AccountController è una classe  che ha uno o più metodi, ognuno dei quali è associato ad un diverso indirizzo URL.
 *  Quando arriva una request verso quell’indirizzo verrà eseguito il metodo corrispondente.
 * @author Eric Marins
 *
 */
@Controller
public class AccountController {
/**
 * il seguente metodo gestisce una request di tipo GET, questo metodo permette di
	 * richiedere dati da un risorsa specificata del server.
 * @return account.html
 */
	@GetMapping("/account")
	public String account() {
		return "account";
	}
}
