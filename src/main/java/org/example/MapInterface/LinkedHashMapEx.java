package org.example.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap <Double, Student2> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student2 student1 = new Student2("Mark", "Nevr", 2);
        Student2 student2 = new Student2("Alice", "Nev", 3);
        Student2 student3 = new Student2("Marsic", "Ns", 1);
        Student2 student4 = new Student2("Popik", "Noo", 4);
        Student2 student5 = new Student2("Petr", "Nere", 4);

        linkedHashMap.put(2.0, student1);
        linkedHashMap.put(2.5, student2);
        linkedHashMap.put(4.0, student3);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(2.5));

        System.out.println(linkedHashMap);
    }
}
