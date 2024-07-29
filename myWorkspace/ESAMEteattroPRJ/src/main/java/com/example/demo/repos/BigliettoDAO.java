package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Biglietto;

public interface BigliettoDAO extends JpaRepository<Biglietto, Integer> {

}
