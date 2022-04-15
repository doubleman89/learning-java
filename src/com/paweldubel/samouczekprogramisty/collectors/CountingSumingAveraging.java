package com.paweldubel.samouczekprogramisty.collectors;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountingSumingAveraging {
    public static void run(){

        java.text.DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil",33,1.75));
        people.add(new Person("Mariusz", 115, 1.5));
        people.add(new Person("Janusz",8650,1.0));


        Optional<Person> min = people.stream()
                .min(Comparator.comparing(person -> person.getAge()));

        Optional<Person> max = people.stream()
                .max(Comparator.comparing(person -> person.getAge()));


        Double averageHeight = people.stream()
                .collect(Collectors.averagingDouble(Person::getHeight));

        people.stream()
                        .collect(Collectors.summingInt(Person::getAge));
// to to samo co :
        people.stream().mapToInt(Person::getAge).sum();

        people.size();




        System.out.println("Najmłodszy jest " + min.get().getName() + " o wieku " + min.get().getAge());
        System.out.println("Najstarszy jest " + max.get().getName() + " o wieku " + max.get().getAge());
        System.out.println(String.format("Sredani wzrostu wynosi: %.2f " , averageHeight));
        System.out.println(String.format("Sredani wzrostu wynosi: " + df.format(averageHeight)));

    }
}
