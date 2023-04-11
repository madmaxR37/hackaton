package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.FanDto;
import com.green_house_contoler.hackaton.services.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class FanController {
    private FanService fanService;

    @Autowired
    public FanController(FanService fanService){
        this.fanService=fanService;
    }

    @GetMapping("/fan")
    public List<FanDto> getFanData(){
        return fanService.getFanInfo();
    }
}
