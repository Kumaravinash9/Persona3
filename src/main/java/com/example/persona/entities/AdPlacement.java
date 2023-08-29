package com.example.persona.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name ="AD_PLACEMENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlacement implements Serializable {

    private static final long serialVersionId = 1L;

    @Id
    @Column(name= "AD_PLACEMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adPlacementId;

    @Column(name= "DEVICE_TYPE")
    private String deviceType;

    @Column(name= "LAT")
    private String lat;

    @Column(name = "LANG")
    private String lang;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name= "AD_PLACEMENT_CONDITION",
            joinColumns = @JoinColumn(name = "AD_PLACEMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "AD_CREATIVE_ID"))
    private List<AdCreative> adCreativeList;

}