package com.springboot2.roomwebapp.controllers;

import com.springboot2.roomwebapp.models.Room;
import com.springboot2.roomwebapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/rooms")
public class RoomRestController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms() {
       return roomService.getAllRooms();
    }



}
