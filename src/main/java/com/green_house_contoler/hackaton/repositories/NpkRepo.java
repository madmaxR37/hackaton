package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.Npk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NpkRepo extends JpaRepository<Npk, Long> {
}
