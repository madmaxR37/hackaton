package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "camera")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Camera {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "image_url")
    private String image;

    @Column(name = "state")
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "gsmModule")
    private GsmModule gsmModule;
}
