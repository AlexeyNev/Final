package org.example.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Alla");
        arrayList.add("Mars");
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
           iterator.next();
           iterator.remove();
        }
        System.out.println(arrayList);
    }
}
