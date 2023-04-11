package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.SoilParametersDto;
import com.green_house_contoler.hackaton.repositories.SoilParamsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class SoilParamService {

    private SoilParamsRepo soilParamsRepo;

    @Autowired
    public SoilParamService(SoilParamsRepo soilParamsRepo){
        this.soilParamsRepo=soilParamsRepo;
    }

    public List<SoilParametersDto> getSoilParams(){

        //check ID before
        return soilParamsRepo.findAll().stream()
                .map(SoilParametersDto::fromEntity)
                .collect(Collectors.toList());
    }
}
