package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Biglietti")
public class Biglietto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double costo;
	@OneToOne
	@JoinColumn(name="posto_id")
	private Posto posto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public Posto getPosto() {
		return posto;
	}
	public void setPosto(Posto posto) {
		this.posto = posto;
	}
	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", costo=" + costo + ", posto=" + posto + "]";
	}
	
	
	
}
