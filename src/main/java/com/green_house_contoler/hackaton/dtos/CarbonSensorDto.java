package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.CarbonSensors;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarbonSensorDto {

    private Long id;

    private Integer carbonLevel;


    public static CarbonSensorDto fromEntity(CarbonSensors carbonSensors){

        return CarbonSensorDto.builder()
                .id(carbonSensors.getId())
                .carbonLevel(carbonSensors.getCarbonLevel())
                .build();
    }

}
