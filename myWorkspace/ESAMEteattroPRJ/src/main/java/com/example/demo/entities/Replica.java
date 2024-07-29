package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="repliche")
public class Replica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "spettacolo_id")
	private Spettacolo spettacolo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Spettacolo getSpettacolo() {
		return spettacolo;
	}

	public void setSpettacolo(Spettacolo spettacolo) {
		this.spettacolo = spettacolo;
	}

	@Override
	public String toString() {
		return "Replica [id=" + id + ", spettacolo=" + spettacolo + "]";
	}
	

}
