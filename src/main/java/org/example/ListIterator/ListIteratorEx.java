package org.example.ListIterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";

        List<Character> list = new LinkedList<>(); // [ m, a, d, a, m]
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();  // с начала листа
        ListIterator<Character> reverseIterator = list.listIterator(list.size());  // с конца листа

        boolean isPalindrom = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) { //
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("OK");
        } else {
            System.out.println("NO OK");
        }
    }
}
