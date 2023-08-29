package com.example.persona.controller;

import com.example.persona.entities.AdCreative;
import com.example.persona.entities.AdPlacement;
import com.example.persona.service.AdPlacementService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@Slf4j
public class AdPlacementController{
    @Autowired
    private AdPlacementService adPlacementService;


    @GetMapping("/{Id}")
    public ResponseEntity<List<AdCreative>> getAdCreativeByPlacementId(@PathVariable long Id){
        AdPlacement adPlacement =  adPlacementService.getAdPlacementById(Id);
        if(null != adPlacement){
            log.info("List of Creative Ads has been successfully sent");
            return ResponseEntity.ok(adPlacement.getAdCreativeList());
        }
        return ResponseEntity.badRequest().body(null);
    }

}