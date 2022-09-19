package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TD3Exo4 {

    public static void main(String[] args)
    {
        List<String> list2 =
                new Random(0)
                        .ints(1_000_000, 0, 100)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.toList());

        //System.out.println(count(list2, "33"));
        printAndTime(() -> count(list2, "33"));
        printAndTime(() -> count2(list2, "33"));
        printAndTime(() -> count3(list2, "33"));
    }

    private static void printAndTime(Supplier<Long> result){
        long start = System.nanoTime();
        long end = System.nanoTime();
        System.out.println("result " + result.get());
        System.out.println(" elapsed time " + ((end / 1000000.0f) - (start / 1000000.0f)) + "ms");
    }

    private static long count(List<String> list, String word) {
        BiFunction<List, String, Long> biFunction = (li, s) -> Long.parseLong(String.valueOf(Collections.frequency(li, s)));
        return biFunction.apply(list, word);
    }

    private static long count2(List<String> list, String word) {
        BiFunction<List, String, Long> biFunction = (li, s) -> li.stream().filter(x -> x.equals(s)).count();
        return biFunction.apply(list, word);
    }

    private static long count3(List<String> list, String word){

        BiFunction<List, String, Long> biFunction = (li, w) -> list.stream().filter(x -> x.equals(word)).mapToLong(x -> 1).sum();
        return biFunction.apply(list, word);
    }
}
