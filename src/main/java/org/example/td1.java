package org.example;

import java.util.Arrays;

public class td1 {

    public static void main(String[] args) {

        String[] collection = {"Java", "c", "Python", "C++", "ada", "lisp"};
        Arrays.sort(collection, String::compareToIgnoreCase);
        System.out.println(Arrays.deepToString(collection));
    }
}

