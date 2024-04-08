package org.example.Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(s -> {s *= 2;
            System.out.println(s);});

        Arrays.stream(array).forEach(s -> System.out.println(s));

        Arrays.stream(array).forEach(System.out::println);
    }
}
