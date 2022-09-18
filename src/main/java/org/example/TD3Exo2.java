package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TD3Exo2 {

    public static void main(String[] args)
    {
        List<String> list = List.of("hello", "world", "hello", "lambda", "hello");

        System.out.println(upperCase(list));
        System.out.println(upperCase2(list));
        System.out.println(upperCase3(list));
        System.out.println(upperCase4(list));
    }

    private static List<String> upperCase(List<String> list){
        List<String> uppercases = new ArrayList<String>(list);

        uppercases.replaceAll(s -> s.toUpperCase());
        return uppercases;
    }

    private static List<String> upperCase2(List<String> list){
        List<String> uppercases = new ArrayList<String>();

        list.stream().map(s -> s.toUpperCase()).forEach(s -> uppercases.add(s));
        return uppercases;
    }

    private static List<String> upperCase3(List<String> list){
        List<String> uppercases = new ArrayList<String>(list);

        uppercases.replaceAll(String::toUpperCase);
        return uppercases;
    }

    private static List<String> upperCase4(List<String> list){
        List<String> uppercases = new ArrayList<String>();

        uppercases = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        return uppercases;
    }
}
