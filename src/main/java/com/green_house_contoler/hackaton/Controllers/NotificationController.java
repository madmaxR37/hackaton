package com.green_house_contoler.hackaton.Controllers;

import com.green_house_contoler.hackaton.dtos.NotificationDto;
import com.green_house_contoler.hackaton.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hackaton")
public class NotificationController {

    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    @GetMapping("/notification")
    public List<NotificationDto> getNotification(){
        return notificationService.getNotifications();
    }
}
