package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.FanDto;
import com.green_house_contoler.hackaton.repositories.FanRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FanService {

    private FanRepo fanRepo;

    @Autowired
    public FanService(FanRepo fanRepo){
        this.fanRepo= fanRepo;

    }

    public List<FanDto> getFanInfo(){

        //check ID before
        return fanRepo.findAll().stream()
                .map(FanDto::fromEntity)
                .collect(Collectors.toList());
    }
}
