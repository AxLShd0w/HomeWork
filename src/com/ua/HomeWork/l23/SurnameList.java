package com.ua.HomeWork.l23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SurnameList {

    public static void main(String[] args) {
        List<String> surname = new ArrayList<>();
        surname.add("Virastiuk");
        surname.add("Shevchenko");
        surname.add("Budanov");
        surname.add("Zaluzhnyi");
        surname.add("Kozlov");
        surname.add("Kozlov");
        surname.add("Zaluzhnyi");
        surname.add("Zaluzhnyi");
        surname.add("Zaluzhnyi");
        surname.add("Virastiuk");
        surname.add("Virastiuk");
        surname.add("Virastiuk");
        surname.add("Budanov");
        surname.add("Budanov");
        surname.add("Budanov");
        surname.add("Budanov");
        surname.add("Shevchenko");
        surname.add("Shevchenko");
        surname.add("Shevchenko");
        surname.add("Shevchenko");
        System.out.println(surname);
        Map<String, Long> map = surname.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    map.entrySet().forEach( entry -> {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    });
    }
}
