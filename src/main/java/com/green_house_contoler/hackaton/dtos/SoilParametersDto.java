package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.SoilParameters;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SoilParametersDto {

    private Long id;

    private Integer soilMoistureLevel;

    public static SoilParametersDto fromEntity(SoilParameters soilParameters){

        return SoilParametersDto.builder()
                .id(soilParameters.getId())
                .soilMoistureLevel(soilParameters.getSoilMoistureLevel())
                .build();
    }

}
