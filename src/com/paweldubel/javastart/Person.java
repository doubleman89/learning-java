package com.paweldubel.javastart;


import java.util.Comparator;
public class Person implements Comparable<Person>, Runnable {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
