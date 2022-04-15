package com.paweldubel.samouczekprogramisty.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
public static void run(){

    List<String> names = new ArrayList<>();
    names.add("Kamil");
    names.add("Mariusz");
    names.add("Janusz");


    String collectJoining = names.stream()
            .collect(Collectors.joining(",","Imiona: "," wszystkie"));

    System.out.println(collectJoining);


}

}
