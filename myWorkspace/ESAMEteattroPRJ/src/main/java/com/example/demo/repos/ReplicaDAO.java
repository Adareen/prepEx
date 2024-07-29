package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Replica;

public interface ReplicaDAO extends JpaRepository<Replica, Integer> {

}
