package com.paweldubel.samouczekprogramisty.streamAPI;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    int age;

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getFirstName() {
        return firstName;
    }

    private List<String> skills;

    public Employee(String firstName, String lastName, int age, List<String> skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skills = skills;
    }

    public String toString(){
        return firstName + lastName + age + skills;
    }
}
