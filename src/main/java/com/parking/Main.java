package com.parking;

import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Void FilterEvenNumber; {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
            numbers.stream() // se instantiaza obiect de tipul stream
                    .filter(num -> num % 2 == 0)
                    .forEach(System.out::println);
        }



    }
}//filter--functie, dam o regula de filtrare, poate fi lista sau array