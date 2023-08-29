package com.example.persona.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.io.Serializable;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name ="AD_CREATIVES")
@NoArgsConstructor
public class AdCreative implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @Column(name= "AD_CREATIVE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adCreativeId;

    @Column(name= "IMAGE_URL")
    private String imageUrl;

    @Column(name= "DEVICE_TYPE")
    private String deviceType;

    @Column(name= "LAT")
    private String lat;

    @Column(name = "LANG")
    private String lang;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name= "AD_PLACEMENT_CONDITION",
            joinColumns = @JoinColumn(name = "AD_CREATIVE_ID"),
            inverseJoinColumns = @JoinColumn(name = "AD_PLACEMENT_ID"))
    private List<AdPlacement> adPlacementList;

}