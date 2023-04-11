package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "air_parameter")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AirParameters {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "temperature")
    private Integer temperature;

    @Column(name = "humidity")
    private Integer humidity;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;
}
