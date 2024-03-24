package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethods4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Alla");
        arrayList1.add("Mars");
        arrayList1.add("Kolya");
        //System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Petr");
        arrayList2.add("Kolya");
        arrayList2.add("Igor");

        //arrayList1.removeAll(arrayList2); removeAll()
        //System.out.println(arrayList1);

        //List<String> list = arrayList1.subList(1, 3); //subList()

        //String[] arr = arrayList1.toArray(new String[4]); //toArray()
        //for (String s : arr) {
        //    System.out.println(s);
        //}

        //List<Integer> list = List.of(1, 4, 5); // List.of()
        //System.out.println(list);

        //List<String> list2 = List.copyOf(arrayList1);  //copyOf()
        //System.out.println(list2);
    }
}
