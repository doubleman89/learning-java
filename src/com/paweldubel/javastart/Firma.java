package com.paweldubel.javastart;

import java.util.Comparator;

public class Firma {

    public static void main(String args[]) {

    /*Pracownik pracownik = new Pracownik(3000,"Mariusz","Ziombek");
    Czlowiek pracownikMariusz = new Pracownik();
    Czlowiek kurierUPS = new Gosc();

    pracownik.OpenDoor();
    kurierUPS.OpenDoor();
    pracownikMariusz.Log("testuje Mariusza");
    kurierUPS.Log("nie umiem");
    */


        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


         Person Janusz = new Person();
         Janusz.setName("Janusz");


        Person Mariusz = new Person();
        Mariusz.setName("Mariusz");


        System.out.println(comparator.compare(Janusz,Mariusz));




    }
}






