package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.CameraDto;
import com.green_house_contoler.hackaton.models.Camera;
import com.green_house_contoler.hackaton.services.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class CameraController {

    private CameraService cameraService;

    @Autowired
    public CameraController(CameraService cameraService){
        this.cameraService=cameraService;
    }

    @GetMapping("/cameraInfo")
    public List<CameraDto> getCameraInfos(){
        return cameraService.getCameraInfo();
    }

    @PostMapping("/image/save")
    public RedirectView saveImage(Camera camera, @RequestParam MultipartFile multipartFile) throws IOException {
        return  cameraService.uploadImage(camera,multipartFile);
    }

}
