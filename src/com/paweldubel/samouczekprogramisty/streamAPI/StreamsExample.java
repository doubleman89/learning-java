package com.paweldubel.samouczekprogramisty.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamsExample {
    List<Employee> employees= new ArrayList<>();


    public void setUp() {



        Employee employee1 = new Employee("Janusz", "Mariusz", 60, List.of("Java","JavaScriptit","Python"));
        Employee employee2 = new Employee("Banusz", "Mariusz", 40, List.of("Java","JavaScriptit","Python"));
        Employee employee3 = new Employee("Basnusz", "Marisadusz", 430, List.of("Java","Java"));
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);


    }

    public void firstStream() {
        employees //.stream commented
                .forEach(System.out::println);
           //     .forEach(employee -> System.out.println(employee));
    }

    public void mapOperation() {

        employees.stream()
                .map(employee -> employee.getLastName() + " " + employee.getFirstName())
                .forEach(System.out::println);

    }

    public void flatMapOperation(){

        List<List<String>> allSkills = employees.stream()
                .map(Employee::getSkills)
                .collect(Collectors.toList());
        System.out.println(allSkills);


        List<String> allSkills2 = employees.stream()
                .map(Employee::getSkills).flatMap(list ->list.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(allSkills2);
    }


    public void filterOperation(){
employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("J"))
                .forEach(System.out::println);



    }

    public void sorterOperation(){
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .forEach(System.out::println);


    }

    public void limitOperation(){
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .limit(1)
                .forEach(System.out::println);
    }

public void skipOperation(){
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .skip(2)
                .forEach(System.out::println);
}

public void countOperation(){
        long count = employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("M"))
                .count();

    System.out.println(count);

}
public void minMaxOperation(){
       Employee youngestEmployee =  employees.stream()
                .min(Comparator.comparing(Employee::getAge)).get();



    System.out.println(youngestEmployee);

}

public void findAnyOperation(){
   //
    Employee anyEmployee =       employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("B"))

               .findAny().get();

    System.out.println(anyEmployee);

}
public void matchOperation() {

    boolean match  = employees.stream()

            .noneMatch(employee -> employee.getFirstName().startsWith("W"));


    System.out.println(match);
    }


//    public void reduceOperation(){
//
//        employees.stream()
//                .map(Employee::getAge)
//                .reduce((employee, employee2) ->employee.);
//
//
//
//    }
}
