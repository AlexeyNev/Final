package org.example.Collection.ArrayList;

import java.util.ArrayList;

public class ArrayMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Alla");
        arrayList.add("Mars");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
