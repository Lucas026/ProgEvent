package org.example;

import java.util.List;
import java.util.function.BiFunction;

public class TD3Exo3 {

    public static void main(String[] args)
    {
        List<String> list = List.of("hello", "world", "hello", "lambda", "hello");

        System.out.println(count3(list, "hello"));
    }

    private static long count3(List<String> list, String word){

        BiFunction<List, String, Long> biFunction = (li, w) -> list.stream().filter(x -> x.equals(word)).mapToLong(x -> 1).sum();
        return biFunction.apply(list, word);
    }

}
