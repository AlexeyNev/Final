package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Ok");
        list.add("GoodBye");

        List<Integer> list1 = list.stream().map(s -> s.length()).collect(Collectors.toList());
//        System.out.println(list1);

        int[] arr = {5, 9, 3, 8, 1};
//        System.out.println(Arrays.toString(arr));
       arr = Arrays.stream(arr).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).toArray();
//        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Ok");
        set.add("GoodBye");
        System.out.println(set);

        Set<Integer> set1 = set.stream().map(s -> s.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
