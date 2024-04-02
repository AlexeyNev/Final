package org.example.SetInterfaceEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Mars");
        set.add("Alla");
        set.add("Ilya");

        for (String s : set) {
            System.out.println(s);
        }

//        set.remove("Ilya");
//        System.out.println(set.contains("Alla"));

        System.out.println(set);
    }
}
