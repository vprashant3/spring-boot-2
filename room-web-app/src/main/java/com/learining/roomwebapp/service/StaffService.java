package com.learining.roomwebapp.service;

import com.learining.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    private static final List<Staff> staffs = new ArrayList<>();
    static {
        for(int i = 0; i < 10; i++) {
            staffs.add(new Staff(Integer.toString(i), "First Name " +i, "Last Name "+i, "Position " +i));
        }
    }

    public List<Staff> getAllStaffs() {return staffs;}
}
