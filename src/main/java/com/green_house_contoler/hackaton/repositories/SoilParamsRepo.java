package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.SoilParameters;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SoilParamsRepo extends JpaRepository<SoilParameters, Long> {
}
