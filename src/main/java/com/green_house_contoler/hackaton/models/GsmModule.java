package com.green_house_contoler.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "gms_module")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GsmModule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "information")
    private Integer information;

    @ManyToOne
    @JoinColumn(name = "farmer")
    private Farmer farmer;

    @OneToMany(mappedBy = "gsmModule")
    private List<AirParameters> airParameters;

    @OneToMany(mappedBy = "gsmModule")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "gsmModule")
    private List<Npk> npks;

    @OneToMany(mappedBy = "gsmModule")
    private List<SoilParameters> soilParameters;

    @OneToMany(mappedBy = "gsmModule")
    private List<Camera> cameras;

    @OneToMany(mappedBy = "gsmModule")
    private List<CarbonSensors> carbonSensors;

    @OneToMany(mappedBy = "gsmModule")
    private List<Fan> fans;

}
