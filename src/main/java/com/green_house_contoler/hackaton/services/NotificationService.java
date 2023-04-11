package com.green_house_contoler.hackaton.services;

import com.green_house_contoler.hackaton.dtos.NotificationDto;
import com.green_house_contoler.hackaton.repositories.NotificationRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class NotificationService {

    private NotificationRepo notificationRepo;

    @Autowired
    public NotificationService(NotificationRepo notificationRepo){
        this.notificationRepo=notificationRepo;
    }

    public List<NotificationDto> getNotifications(){

        //check ID before
        return notificationRepo.findAll().stream()
                .map(NotificationDto::fromEntity)
                .collect(Collectors.toList());
    }

}
