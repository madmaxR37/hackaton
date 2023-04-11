package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.AirParametersDto;
import com.green_house_contoler.hackaton.repositories.AirParametersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AirParamsService {

    private AirParametersRepo airParametersRepo;

    @Autowired
    public AirParamsService(AirParametersRepo airParametersRepo){
        this.airParametersRepo=airParametersRepo;
    }

    public List<AirParametersDto> getAirparams(){

//check ID before
        return airParametersRepo.findAll().stream()
                .map(AirParametersDto::fromEntity)
                .collect(Collectors.toList());
    }
}
