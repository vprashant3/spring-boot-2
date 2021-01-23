package com.springboot2.roomwebapp.controllers;

import com.springboot2.roomwebapp.models.Staff;
import com.springboot2.roomwebapp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/staff")
public class StaffRestController {

    @Autowired
    StaffService staffService;

    @GetMapping
    public List<Staff> getAllStaff() {
       return staffService.getAllStaffs();
    }



}
