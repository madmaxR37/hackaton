package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "npk")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Npk {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "npk_level")
    private Integer npkLevel;

    @Column(name = "ph_level")
    private Integer phLevel;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;

}
