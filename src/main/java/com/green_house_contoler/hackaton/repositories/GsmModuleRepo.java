package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.GsmModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GsmModuleRepo extends JpaRepository<GsmModule,Long> {
}
