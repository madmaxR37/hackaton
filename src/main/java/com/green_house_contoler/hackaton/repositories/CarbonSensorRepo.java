package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.CarbonSensors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarbonSensorRepo extends JpaRepository<CarbonSensors, Long> {

}
