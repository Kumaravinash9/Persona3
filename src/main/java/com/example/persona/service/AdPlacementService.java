package com.example.persona.service;


import com.example.persona.entities.AdPlacement;
import com.example.persona.repository.AdPlacementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AdPlacementService{
    @Autowired
    private AdPlacementRepository adCreativeRepository;

    public AdPlacement getAdPlacementById(final Long placementId){
       final Optional<AdPlacement> adPlacement = adCreativeRepository.findById(placementId);
       return  adPlacement.isPresent() ? adPlacement.get() : null;
    }
 }