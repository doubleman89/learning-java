package com.paweldubel.samouczekprogramisty.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
        public static void run(){
            List<Person> people = new ArrayList<>();

            people.add(new Person("Kamil",33,1.75));
            people.add(new Person("Mariusz", 115, 1.5));
            people.add(new Person("Janusz",8650,1.0));

            Map<Integer, List<Person>> ageMap = people.stream()
                    .collect(Collectors.groupingBy(person -> person.getAge()));

            System.out.println(ageMap.toString());


            List<String> teams = new ArrayList<>();
            teams.add("Poland");
            teams.add("Slovakia");
            teams.add("Spain");
            teams.add("Sweden");
            teams.add("Sweden");

            Map<Boolean, List<String>> collect = teams.stream()
                    .collect(Collectors.groupingBy(team -> team.startsWith("S")));

            System.out.println(collect.get(true));

            Map<Boolean, List<String>> partitioning = teams.stream()
                    .collect(Collectors.partitioningBy(team -> team.startsWith("S")));
            System.out.println(partitioning.get(false));

            Map<Boolean, List<Person>> ageAboveValue = people.stream()
                    .collect(Collectors.partitioningBy(person -> person.getAge() > 44));

            System.out.println(ageAboveValue);


        }
}
