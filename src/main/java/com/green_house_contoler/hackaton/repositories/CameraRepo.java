package com.green_house_contoler.hackaton.repositories;

import com.green_house_contoler.hackaton.models.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CameraRepo extends JpaRepository<Camera, Long> {

}
