package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.CarbonSensorDto;
import com.green_house_contoler.hackaton.services.CarbonSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class CarbonSensorController {

    private CarbonSensorService carbonSensorService;

    @Autowired
    public CarbonSensorController(CarbonSensorService carbonSensorService){
         this.carbonSensorService=carbonSensorService;
    }

    @GetMapping("/carbonSensor")
    public List<CarbonSensorDto> getCarbonData(){
        return carbonSensorService.getCarbonSensordata();
    }
}
