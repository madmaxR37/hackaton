package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "soil_parameter")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SoilParameters {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "soil_moisture_level")
    private Integer soilMoistureLevel;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;

}
