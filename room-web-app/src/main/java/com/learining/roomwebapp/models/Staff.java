package com.learining.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Staff {
    private String id;
    private String firstName;
    private String lastName;
    private String position;
}
