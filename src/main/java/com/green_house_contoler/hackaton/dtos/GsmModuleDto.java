package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.GsmModule;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GsmModuleDto {

    private Long id;

    private Integer information;


    public static GsmModuleDto fromEntity(GsmModule gsmModule){


        return GsmModuleDto.builder()
                .id(gsmModule.getId())
                .information(gsmModule.getInformation())
                .build();
    }

}
