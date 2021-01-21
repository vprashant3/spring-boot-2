package com.learining.roomwebapp.controllers;

import com.learining.roomwebapp.models.Room;
import com.learining.roomwebapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public List<Room> getAllRooms(Model model) {
       return roomService.getAllRooms();
    }



}
