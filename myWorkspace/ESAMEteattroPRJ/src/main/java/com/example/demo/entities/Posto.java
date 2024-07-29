package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="posti")
public class Posto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fila;
	private int posto;
	private TipoPosto tipoPosto;
	private boolean disponibilita; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public int getPosto() {
		return posto;
	}
	public void setPosto(int posto) {
		this.posto = posto;
	}
	
	
	@Override
	public String toString() {
		return "Posto [id=" + id + ", fila=" + fila + ", posto=" + posto + "]";
	}
	public TipoPosto getTipoPosto() {
		return tipoPosto;
	}
	public void setTipoPosto(TipoPosto tipoPosto) {
		this.tipoPosto = tipoPosto;
	}
	public boolean getDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	
	
	
	


}

