package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.GsmModuleDto;
import com.green_house_contoler.hackaton.services.GsmModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class GsmModuleController {

    private GsmModuleService gsmModuleService;

    @Autowired
    public GsmModuleController(GsmModuleService gsmModuleService){
        this.gsmModuleService=gsmModuleService;
    }

    @GetMapping("/gsmModule")
    public List<GsmModuleDto> getGsmModuleData(){
        return gsmModuleService.getGsmModuleInfo();
    }
}
