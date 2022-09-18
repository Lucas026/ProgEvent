package org.example;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class TD3 {

    public static void main(String[] args)
    {
        List<String> list = List.of("hello", "world", "hello", "lambda", "hello");

        System.out.println(count(list, "hello"));
        System.out.println(count2(list, "hello"));

        System.out.println(upperCase(list));
    }

    private static long count(List<String> list, String word) {
        BiFunction<List, String, Long> biFunction = (li, s) -> Long.parseLong(String.valueOf(Collections.frequency(li, s)));
        return biFunction.apply(list, word);
     }

    private static long count2(List<String> list, String word) {
        BiFunction<List, String, Long> biFunction = (li, s) -> li.stream().filter(x -> x.equals(s)).count();
        return biFunction.apply(list, word);
    }

    private static List<String> upperCase(List<String> list) {
        BiFunction<List<String>, String, List<String>> upperFunction = li -> li
        return upperFunction.apply(list);
    }

}
