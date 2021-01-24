package com.springboot2.roomwebapp.service;

import com.springboot2.roomwebapp.data.RoomRepository;
import com.springboot2.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getAllRooms() {return roomRepository.findAll();}
}
