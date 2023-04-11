package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.FarmerDto;
import com.green_house_contoler.hackaton.repositories.FarmerRepo;
import com.green_house_contoler.hackaton.models.Farmer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@Slf4j
public class FarmerService {

    private FarmerRepo farmer;

    @Autowired
    public FarmerService(FarmerRepo farmer){
        this.farmer=farmer;
    }

    public FarmerDto save(FarmerDto farmerDto){
   //validate farmerDto
        return FarmerDto.fromEntity(farmer.save(FarmerDto.toEntity(farmerDto)));
    }

    public FarmerDto findfarmerById(Long id){
        //check ID

        Optional<Farmer> farmerEntity= farmer.findById(id);
        FarmerDto farmerDto = FarmerDto.fromEntity(farmerEntity.get());
        return Optional.of(farmerDto).orElseThrow(()-> new EntityNotFoundException("Farmer with that id not found"));
    }

}
