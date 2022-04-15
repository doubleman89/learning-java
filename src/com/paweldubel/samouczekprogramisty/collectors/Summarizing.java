package com.paweldubel.samouczekprogramisty.collectors;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarizing {

    public static void run(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil",33,1.75));
        people.add(new Person("Mariusz", 115, 1.5));
        people.add(new Person("Janusz",8650,1.0));

        IntSummaryStatistics ageSummarizing = people.stream()
                .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(ageSummarizing);
        System.out.println(ageSummarizing.getMax());
        System.out.println(ageSummarizing.getMin());
        System.out.println(String.format("%.2f",ageSummarizing.getAverage()));
        System.out.println(ageSummarizing.getSum());


    }
}
