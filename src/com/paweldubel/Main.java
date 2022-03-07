package com.paweldubel;

import java.time.LocalDate;

public class Main {

public static void main(String[] args) {

    //  GenderCheck.GenderCheck();
    //   Arrays.CheckArrayNumbers();
//Loops.Continue();
    //  Loops.While();
    //  Loops.DoWhile();
// Passport class
   // Passport plPassport = new Passport("123","Poland", LocalDate.of(1906,1,3));











}
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(
                String brand,
                String focallength,
                boolean isPrime){


            this.brand = brand;
            this.focalLength = focallength;
            this.isPrime = isPrime;
        }
    }
static class Passport {
    String number;
    LocalDate expiryDate;
    String country;

    Passport(String number, String country,LocalDate expiryDate)
    {
        this.number = number;
                this.expiryDate = expiryDate;
                this.country = country;
    }


}

}

