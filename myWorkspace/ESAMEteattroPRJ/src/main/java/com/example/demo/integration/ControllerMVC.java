package com.example.demo.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerMVC {
	
	// con la / chiamo la pagina index.html che inserirò in static.
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	@GetMapping("carrello")
	public String carrello() {
		return "carrello";
	}
	@GetMapping("spettacolo")
	public String spettacolo() {
		return "spettacolo";
	}

	

}
