package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Biglietto;
import com.example.demo.entities.Posto;
import com.example.demo.entities.Prenotazione;
import com.example.demo.entities.Replica;
import com.example.demo.entities.Spettacolo;
import com.example.demo.entities.Utente;
import com.example.demo.services.BiglietteriaService;



@RestController
@RequestMapping("api")
public class RestCONTROLLER {
	
	@Autowired
	private BiglietteriaService service;
	
	
	@GetMapping("posti")
	public List<Posto> getPosti(){
		return service.readPosto();
	}
	
	@GetMapping("biglietti")
	public List<Biglietto> getBiglietti(){
		return service.readBiglietto();
	}
	
	
	@GetMapping("prenotazioni")
	public List<Prenotazione> getPrenotazioni(){
		return service.readPrenotazione();
	}
	
	@GetMapping("repliche")
	public List<Replica> getRepliche(){
		return service.readReplica();
	}
	@GetMapping("spettacolo")
	public List<Spettacolo> getspettacolo(){
		return service.readSpettacolo();
	}
	@GetMapping("utenti")
	public List<Utente> getUtenti(){
		return service.readUtente();
	}
	
	// post 
	@PostMapping("posti")
	public Posto addPosto(@RequestBody Posto p){
		return service.addPosto(p);
	}
	@PostMapping("utenti")
	public Utente addUtente(@RequestBody Utente u){
		return service.addUtente(u);
	}
	@PostMapping("biglietti")
	public Biglietto addBiglietto(@RequestBody Biglietto b){
		return service.addBiglietto(b);
	}
	
	@PostMapping("repliche")
	public Replica addReplica(@RequestBody Replica r){
		return service.addReplica(r);
	}
	
	@PostMapping("prenotazioni")
	public Prenotazione addPrenotazione(@RequestBody Prenotazione p){
		return service.addPrenotazione(p);
	}
	
	@PostMapping("spettacolo")
	public Spettacolo addSpettacolo(@RequestBody Spettacolo s){
		return service.addSpettacolo(s);
	}
	
	

}
