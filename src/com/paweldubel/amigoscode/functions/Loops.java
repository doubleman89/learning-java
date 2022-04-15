package com.paweldubel.amigoscode.functions;

public class Loops {
   
 public static void Continue()
 {

    int x ;

    String[] names = {"Lili", "Pola", "Hanna"};
    for (String name : names) {

      if (name.equals("Lili")){
         continue;
      }
       System.out.println(name);
    }

 }


 public static void While()
 {
     boolean stopWhile = false;
     int count;
     count = 0;
     while(stopWhile!= true){
         System.out.println("Current count is :" + count);
         count++;

         stopWhile = count >= 20;





     }




 }

   
   public static void DoWhile()
   {
       int count = 0;

       do {
           System.out.println(count);
           count++;
       }
       while (count <=20 );




   }
   
   
   



}
