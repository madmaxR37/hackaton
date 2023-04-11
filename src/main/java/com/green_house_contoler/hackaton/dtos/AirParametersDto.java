package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.AirParameters;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirParametersDto {

    private Long id;

    private Integer temperature;

    private Integer humidity;

    public static AirParametersDto fromEntity(AirParameters airParameters){

        return AirParametersDto.builder()
                .temperature(airParameters.getTemperature())
                .humidity(airParameters.getHumidity())
                .build();
    }

}
