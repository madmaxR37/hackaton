package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.Fan;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FanDto {

    private Long id;

    private Boolean state;

    public static FanDto fromEntity(Fan fan){

        return FanDto.builder()
                .id(fan.getId())
                .state(fan.getState())
                .build();
    }

}
