package com.springboot2.roomwebapp.controllers;

import com.springboot2.roomwebapp.models.Staff;
import com.springboot2.roomwebapp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller @RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    @GetMapping
    public Model getAllStaff(Model model) {
        List<Staff> allStaffs = staffService.getAllStaffs();
        model.addAttribute("staffs", allStaffs);
        return model;
    }



}
