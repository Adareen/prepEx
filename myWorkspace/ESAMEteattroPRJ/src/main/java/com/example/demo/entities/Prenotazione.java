package com.example.demo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	
	private String nomeUtente;
	private LocalDate data;
	
	@OneToOne
	@JoinColumn(name="replica_id")
	private Replica replica;
	
	@OneToMany
	private List<Posto> posti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public List<Posto> getPosti() {
		return posti;
	}

	public void setPosti(ArrayList<Posto> posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", nomeUtente=" + nomeUtente + ", data=" + data + ", replica=" + replica
				+ ", posti=" + posti + "]";
	}
	
	

}
