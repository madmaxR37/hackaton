package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.SoilParametersDto;
import com.green_house_contoler.hackaton.services.SoilParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class SoilParamController {

    private SoilParamService soilParamService;

    @Autowired
    public SoilParamController(SoilParamService soilParamService){
        this.soilParamService=soilParamService;
    }

    @GetMapping("/soilParameters")
    public List<SoilParametersDto> getFanData(){
        return soilParamService.getSoilParams();
    }
}
