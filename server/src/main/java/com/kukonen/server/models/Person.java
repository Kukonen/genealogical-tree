package com.kukonen.server.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private LocalDate birth;
    private LocalDate death;
    private Gender gender;

    // описание жизни
    private String lifeline;

    private Person mother;
    private Person father;

    private ArrayList<Person> children;
}
