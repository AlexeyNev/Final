package org.example.MapInterface;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Alex", "Nevred", 2);
        Student2 student2 = new Student2("Alla", "Nev", 3);
        Student2 student3 = new Student2("Mars", "Ns", 1);
        Student2 student4 = new Student2("Mark", "Noo", 4);
        Student2 student5 = new Student2("Petr", "Ne", 5);

        TreeMap<Double, Student2> treeMap = new TreeMap<>();
        treeMap.put(1.5, student1);
        treeMap.put(2.0, student2);
        treeMap.put(3.5, student3);
        treeMap.put(4.0, student4);
        treeMap.put(2.5, student5);
        System.out.println(treeMap);

    }
}
