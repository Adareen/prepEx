package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Biglietto;
import com.example.demo.entities.Posto;
import com.example.demo.entities.Prenotazione;
import com.example.demo.entities.Replica;
import com.example.demo.entities.Spettacolo;
import com.example.demo.entities.Utente;
import com.example.demo.repos.BigliettoDAO;
import com.example.demo.repos.PostoDAO;
import com.example.demo.repos.PrenotazioneDAO;
import com.example.demo.repos.ReplicaDAO;
import com.example.demo.repos.SpettacoloDAO;
import com.example.demo.repos.UtenteDAO;

@Service
public class BiglietteriaServiceIMPL implements BiglietteriaService {

	
	@Autowired
	private BigliettoDAO bigliettoDAO;
	
	@Autowired
	private ReplicaDAO replicaDAO;
	
	@Autowired
	private SpettacoloDAO spettacoloDAO;
	
	@Autowired
	private UtenteDAO utenteDAO;
	
	@Autowired
	private PostoDAO postoDAO;
	
	@Autowired
	private PrenotazioneDAO prenotazioneDAO;
	
	
	
	
	@Override
	public Posto addPosto(Posto p) {
		// TODO Auto-generated method stub
		return postoDAO.save(p);
	}

	@Override
	public Biglietto addBiglietto(Biglietto b) {
		// TODO Auto-generated method stub
		return bigliettoDAO.save(b);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return prenotazioneDAO.save(p);
	}

	@Override
	public Replica addReplica(Replica r) {
		// TODO Auto-generated method stub
		return replicaDAO.save(r);
	}

	@Override
	public Spettacolo addSpettacolo(Spettacolo s) {
		// TODO Auto-generated method stub
		return spettacoloDAO.save(s);
	}

	@Override
	public List<Posto> readPosto() {
		// TODO Auto-generated method stub
		return postoDAO.findAll();
	}

	@Override
	public List<Biglietto> readBiglietto() {
		// TODO Auto-generated method stub
		return bigliettoDAO.findAll();
	}

	@Override
	public List<Prenotazione> readPrenotazione() {
		// TODO Auto-generated method stub
		return prenotazioneDAO.findAll();
	}

	@Override
	public List<Replica> readReplica() {
		// TODO Auto-generated method stub
		return replicaDAO.findAll();
	}

	@Override
	public List<Spettacolo> readSpettacolo() {
		// TODO Auto-generated method stub
		return spettacoloDAO.findAll();
	}

	@Override
	public Posto updatePosto(Posto p) {
		// TODO Auto-generated method stub
		return postoDAO.save(p);
	}

	@Override
	public Biglietto updateBiglietto(Biglietto b) {
		// TODO Auto-generated method stub
		return bigliettoDAO.save(b);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return prenotazioneDAO.save(p);
	}

	@Override
	public Replica updateReplica(Replica r) {
		// TODO Auto-generated method stub
		return replicaDAO.save(r);
	}

	@Override
	public Spettacolo updateSpettacolo(Spettacolo s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		prenotazioneDAO.delete(p);
	}

	@Override
	public Utente addUtente(Utente u) {
		// TODO Auto-generated method stub
		return utenteDAO.save(u);
	}

	@Override
	public List<Utente> readUtente() {
		// TODO Auto-generated method stub
		return utenteDAO.findAll();
	}

	@Override
	public Utente updateUtente(Utente u) {
		// TODO Auto-generated method stub
		return utenteDAO.save(u);
	}

}
