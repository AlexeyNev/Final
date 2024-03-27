package org.example.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Alex Nevredimov");
        map.put(3568, "Ivan Petrov");
        map.put(6578, "Mariya Sidorova");
        map.put(15879, "Nikolay katkov");


        System.out.println(map);
    }
}
