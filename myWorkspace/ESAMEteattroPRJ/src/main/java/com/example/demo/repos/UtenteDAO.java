package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
