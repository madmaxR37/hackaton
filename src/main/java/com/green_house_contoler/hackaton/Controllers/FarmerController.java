package com.green_house_contoler.hackaton.Controllers;


import com.green_house_contoler.hackaton.dtos.FarmerDto;
import com.green_house_contoler.hackaton.services.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hackaton")
public class FarmerController {

    private FarmerService farmerService;

    @Autowired
    public FarmerController(FarmerService farmerService){
        this.farmerService=farmerService;
    }

    @PostMapping("/farmer/create")
    FarmerDto savefarmer(@RequestBody FarmerDto farmerDto){
        return farmerService.save(farmerDto);
    }
}
