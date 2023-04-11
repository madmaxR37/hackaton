package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.AirParameters;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirParametersRepo extends JpaRepository<AirParameters, Long> {

}
