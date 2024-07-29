package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Biglietto;
import com.example.demo.entities.Posto;
import com.example.demo.entities.Prenotazione;
import com.example.demo.entities.Replica;
import com.example.demo.entities.Spettacolo;
import com.example.demo.entities.Utente;

public interface BiglietteriaService {
	
	//descrivo i metodi CRUD di quello che voglio usare 
	
	//create
	Posto addPosto(Posto p);
	Biglietto addBiglietto(Biglietto b);
	Prenotazione addPrenotazione(Prenotazione p);
	Replica addReplica(Replica r);
	Spettacolo addSpettacolo(Spettacolo s);
	Utente addUtente(Utente u);
	
	//read
	List<Posto> readPosto();
	List<Biglietto> readBiglietto();
	List<Prenotazione> readPrenotazione();
	List<Replica> readReplica();
	List<Spettacolo> readSpettacolo();
	List<Utente> readUtente();
	
	//update
	Posto updatePosto(Posto p);
	Biglietto updateBiglietto(Biglietto b);
	Prenotazione updatePrenotazione(Prenotazione p);
	Replica updateReplica(Replica r);
	Spettacolo updateSpettacolo(Spettacolo s);
	Utente updateUtente(Utente u);
	
	//delete
	void deletePrenotazione(Prenotazione p);
	
	
	

}
