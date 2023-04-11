package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.repositories.CarbonSensorRepo;
import com.green_house_contoler.hackaton.dtos.CarbonSensorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CarbonSensorService {

    private CarbonSensorRepo carbonSensorRepo;

    @Autowired
    public CarbonSensorService(CarbonSensorRepo carbonSensorRepo){
        this.carbonSensorRepo= carbonSensorRepo;
    }

    public List<CarbonSensorDto> getCarbonSensordata(){

        //check ID before
        return carbonSensorRepo.findAll().stream()
                .map(CarbonSensorDto::fromEntity)
                .collect(Collectors.toList());
    }
}
