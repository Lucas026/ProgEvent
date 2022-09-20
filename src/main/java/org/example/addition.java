package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;

public class addition {

    public static void main(String[] args) {

        ToLongFunction<Integer> somme = add(3);
        System.out.println(somme.applyAsLong(5));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(5);
        list.forEach((num) -> System.out.println(add(num).applyAsLong(78)));
    }

    public static ToLongFunction<Integer> add(Integer calcul){

        ToLongFunction<Integer> result = (value) -> value + calcul;

        return result;
    }
}
