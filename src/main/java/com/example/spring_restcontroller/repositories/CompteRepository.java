package com.example.spring_restcontroller.repositories;

import com.example.spring_restcontroller.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte , Long> {
}
