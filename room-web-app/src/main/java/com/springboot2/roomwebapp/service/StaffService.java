package com.springboot2.roomwebapp.service;

import com.springboot2.roomwebapp.data.StaffRepository;
import com.springboot2.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaffs() {return staffRepository.findAll();}
}
