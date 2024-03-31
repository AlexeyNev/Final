package org.example.Homework;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        String[] words = s.split("");

        List<String> list = new ArrayList<>();
        for (String l : words) {
            list.add(l);
        }
        Collections.sort(list);

        StringBuilder stringBuilder = new StringBuilder();
        for (String l : list) {
            stringBuilder.append(l);
        }
        return stringBuilder.toString();
    }
}
