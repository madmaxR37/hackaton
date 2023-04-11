package com.green_house_contoler.hackaton.services;


import com.green_house_contoler.hackaton.dtos.NpkDto;
import com.green_house_contoler.hackaton.repositories.NpkRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class NpkService {

    private NpkRepo npkRepo;

    @Autowired
    public NpkService(NpkRepo npkRepo){
        this.npkRepo=npkRepo;
    }
    public List<NpkDto> getNpk(){

        //check ID before
        return npkRepo.findAll().stream()
                .map(NpkDto::fromEntity)
                .collect(Collectors.toList());
    }
}
