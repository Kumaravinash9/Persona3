package com.example.persona.repository;

import com.example.persona.entities.AdCreative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdCreativeRepository extends JpaRepository<AdCreative, Long> {

}