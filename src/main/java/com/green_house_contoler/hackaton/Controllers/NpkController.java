package com.green_house_contoler.hackaton.Controllers;


import com.green_house_contoler.hackaton.dtos.NpkDto;
import com.green_house_contoler.hackaton.services.NpkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class NpkController {

    private NpkService npkService;

    @Autowired
    public NpkController(NpkService npkService){
        this.npkService=npkService;
    }

    @GetMapping("/npk")
    public List<NpkDto> getNpkInfo(){
        return npkService.getNpk();
    }
}
