package com.paweldubel.amigoscode;


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
  //  TestMainString.main(new String[]{"Kamil","Mariusz"});
//    Punkt punkt= new Punkt();
 //   punkt.x = 5;
 //   punkt.y = 8;
 //   Test.zwieksz(punkt);
 //   System.out.println("Wspolrzedne wynosza: "+ punkt.x +" (x) ," + punkt.y + " (y)");

   // IfTutorial.forLoopTest(-20,40);


//IfTutorial nowyObiekt = new IfTutorial();
//nowyObiekt.whileLoopTest(10,20);

//int intArray[][] = {{1,2},{1,2,3,4,6,7,8,9}};

//IfTutorial.returnTotal(intArray);

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

