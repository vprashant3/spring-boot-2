package com.learining.roomwebapp.controllers;

import com.learining.roomwebapp.models.Room;
import com.learining.roomwebapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller @RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public Model getAllRooms(Model model) {
        List<Room> allRooms = roomService.getAllRooms();

        model.addAttribute("rooms", allRooms);
        return model;
    }



}
