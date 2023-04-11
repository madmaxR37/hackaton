package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.Farmer;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FarmerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    public static FarmerDto fromEntity(Farmer farmer){

        if (farmer==null){
            //throw exception
            return null;
        }

        return FarmerDto.builder()
                .id(farmer.getId())
                .firstName(farmer.getFirstName())
                .lastName(farmer.getLastName())
                .email(farmer.getEmail())
                .password(farmer.getPassword())
                .build();
    }

    public static  Farmer toEntity(FarmerDto farmerDto){

        if (farmerDto==null){
            //throw exception
            return null;
        }

        return Farmer.builder()
                .firstName(farmerDto.getFirstName())
                .lastName(farmerDto.getLastName())
                .email(farmerDto.getEmail())
                .password(farmerDto.getPassword())
                .build();
    }
}
