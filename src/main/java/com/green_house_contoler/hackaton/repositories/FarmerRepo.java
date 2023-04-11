package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface FarmerRepo extends JpaRepository<Farmer, Long> {
    Optional<Farmer> findById(Long id);
}
