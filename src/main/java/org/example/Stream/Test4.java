package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        //5, 8, 2, 4, 3
        // accumulator = 5 (5*8=40)    accumulator = 40  (40*2=80)  accumulator = 80  (80*4=320)
        // element = 8     element = 2     element = 4     element = 3


        int result2 = list.stream().reduce(1,(accumulator, element) -> accumulator * element);
        //5, 8, 2, 4, 3
        // accumulator = 1 (1*5=0) 5
        // element = 5     element = 8     element = 4     element = 3
        // identity 1 значит, что аккумулятор будет начинаться с 1. null значений не будет


//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator * element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }




        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("Ok");
        list3.add("GoodBye");

        String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}
