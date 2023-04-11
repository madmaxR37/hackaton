package com.green_house_contoler.hackaton.dtos;

import com.green_house_contoler.hackaton.models.Notification;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDto {

    private Long id;

    private String name;


    public static NotificationDto fromEntity(Notification notification){

        return NotificationDto.builder()
                .id(notification.getId())
                .name(notification.getName())
                .build();
    }

}
