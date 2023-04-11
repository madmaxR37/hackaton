package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.Fan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanRepo extends JpaRepository<Fan,Long> {

}
