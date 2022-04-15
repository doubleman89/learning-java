package com.paweldubel.samouczekprogramisty.basics;

public class Uzytkownik {
    private int age;
    private String name;

    public Uzytkownik(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

public boolean canHeBuyLiquor(){

        if  (age>=18){
return true;
    }
    else
    {
        return false;
    }
}
}
