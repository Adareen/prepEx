package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Spettacolo;

public interface SpettacoloDAO extends JpaRepository<Spettacolo, Integer> {

}
