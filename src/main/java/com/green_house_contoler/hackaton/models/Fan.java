package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "fan")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "state")
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;

}
