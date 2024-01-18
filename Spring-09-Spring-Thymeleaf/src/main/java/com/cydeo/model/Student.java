package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String state;
}
