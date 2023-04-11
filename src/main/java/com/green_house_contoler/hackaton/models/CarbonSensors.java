package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "carbon_sensor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarbonSensors {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "carbon_level")
    private Integer carbonLevel;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;

}
