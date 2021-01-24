package com.springboot2.roomwebapp.data;

import com.springboot2.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Long> {
}
