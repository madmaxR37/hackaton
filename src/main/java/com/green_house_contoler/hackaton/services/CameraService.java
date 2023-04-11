package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.CameraDto;
import com.green_house_contoler.hackaton.models.Camera;
import com.green_house_contoler.hackaton.models.utils.FileUploadUtil;
import com.green_house_contoler.hackaton.repositories.CameraRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CameraService {

    private CameraRepo cameraRepo;

    @Autowired
    public CameraService(CameraRepo cameraRepo){
        this.cameraRepo= cameraRepo;
    }

    public List<CameraDto> getCameraInfo(){


        //check ID before
        return cameraRepo.findAll().stream()
                .map(CameraDto::fromEntity)
                .collect(Collectors.toList());
    }

    public RedirectView uploadImage(Camera camera,MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());

        camera.setImage(fileName);

        Camera savedImage = cameraRepo.save(camera);

        String uploadDir = "images/" +savedImage.getId();

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return new RedirectView("/cameraInfo", true);

    }
}
