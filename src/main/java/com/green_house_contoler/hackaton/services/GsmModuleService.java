package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.GsmModuleDto;
import com.green_house_contoler.hackaton.repositories.GsmModuleRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GsmModuleService {

    private GsmModuleRepo gsmModuleRepo;

    @Autowired
    public GsmModuleService(GsmModuleRepo gsmModuleRepo){
        this.gsmModuleRepo=gsmModuleRepo;
    }

    public List<GsmModuleDto> getGsmModuleInfo(){

        //check ID before
        return gsmModuleRepo.findAll().stream()
                .map(GsmModuleDto::fromEntity)
                .collect(Collectors.toList());
    }
}
