package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.AirParametersDto;
import com.green_house_contoler.hackaton.services.AirParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class AirParamsController {

    private AirParamsService airParamsService;

    @Autowired
    public AirParamsController (AirParamsService airParamsService){
        this.airParamsService=airParamsService;
    }

    @GetMapping("/airParameters")
    public List<AirParametersDto>  getAirParameters(){
        return airParamsService.getAirparams();
    }

}
