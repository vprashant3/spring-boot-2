package com.springboot2.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="EMPLOYEE")
public class Staff {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    private String position;
}
