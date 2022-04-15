package com.paweldubel.samouczekprogramisty.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class ToListSetMap {

    public static void run(){

        List<String> teams = new ArrayList<>();
        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Sweden");

        List<String> teamsStartingwithS = teams.stream()
                .filter(filter1 -> filter1.startsWith("S"))
                .collect(toList());
        teamsStartingwithS.add("Scotland");

        System.out.println(teamsStartingwithS);

        Set<String> setofTeamsStartingWithSet = teams.stream()
                .filter(filter1 -> filter1.startsWith("S"))
                .collect(toSet());

        System.out.println(setofTeamsStartingWithSet);

        Country country = new Country("Poland", "Warsaw");
        Country country1 = new Country("Spain", "Madrid");
        Country country2 = new Country("Slovakia", "Bratislava");
        Country country3 = new Country("Sweden", "Stockholm");

        List <Country> countries = new ArrayList<>();
        countries.add(country);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        Map<String, String> mapOfCountries = countries.stream()
                .filter(countryFromMap->countryFromMap.getName().startsWith("S"))
                .collect(toMap(Country::getName, Country::getCapital,(oldValue,newValue)->newValue));
        System.out.println(mapOfCountries);


    }
}
