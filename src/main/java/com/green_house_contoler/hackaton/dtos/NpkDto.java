package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.Npk;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NpkDto {

    private Long id;

    private Integer npkLevel;

    private Integer phLevel;

    public static NpkDto fromEntity(Npk npk){

        return NpkDto.builder()
                .id(npk.getId())
                .npkLevel(npk.getNpkLevel())
                .phLevel(npk.getPhLevel())
                .build();
    }

}
