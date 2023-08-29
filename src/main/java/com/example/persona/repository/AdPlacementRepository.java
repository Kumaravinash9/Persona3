package com.example.persona.repository;

import com.example.persona.entities.AdPlacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdPlacementRepository  extends JpaRepository<AdPlacement, Long> {

}