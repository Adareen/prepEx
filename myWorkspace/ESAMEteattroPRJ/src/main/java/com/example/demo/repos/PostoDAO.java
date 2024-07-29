package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Posto;

public interface PostoDAO extends JpaRepository<Posto, Integer> {

}
