package com.paweldubel.amigoscode.functions;



import java.util.*;

public class TestMainString {




    public static void main(String[] args) {



     /*   String checkName = "Mariusz";
        List <String> names = new ArrayList<>();
        Scanner nameScanner = new Scanner(System.in );


        if (args.length > 0 && false) {

            System.out.println(args[0]);
            System.out.println(args[1]);


        }



        names.add("Mariusz");
        names.add("Dominik");
        names.add("Blazej");
        names.add("Mariusz");
        names.add("Janusz");
        Collections.sort(names);
        for (String name: names) {
            System.out.println(name);
        }

        names.remove("Mariusz");


        names.remove(1);

        System.out.println();

        for (String name: names) {
            System.out.println(name);
        }


        System.out.println();

        System.out.println();

        System.out.println("Pierwszy element na liscie to :" + names.get(0));

        boolean isBlazej = names.contains("Mariusz");


        if (isBlazej){

            System.out.println(" Mariusz jest na liscie");
        }

        names.clear();
        System.out.println(names.isEmpty());
*/
      /*  Set <String> meals = new HashSet<>();
        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");
        meals.add("Salad");
        meals.add("Burger");

        for (String meal: meals
             ) {
            System.out.println(meal);
        }
        System.out.println(meals.size());

*/
        boolean b = false;

        System.out.println(Boolean.valueOf(b));

        Map<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Mariusz","Pizza");
        nameToMeal.put("Dominik","Burger");
        nameToMeal.put("Kamil","Burger");
        nameToMeal.put("Dominik","Pasta");
        System.out.println(nameToMeal.get("Dominik"));
//nameToMeal.clear();
        System.out.println(nameToMeal.keySet());


    }
}
