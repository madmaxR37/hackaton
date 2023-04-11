package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.Camera;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CameraDto {

    private Long id;

    private String image;

    private Boolean state;


    public static CameraDto fromEntity(Camera camera){

        return CameraDto.builder()
                .id(camera.getId())
                .image(camera.getImage())
                .state(camera.getState())
                .build();
    }

}
