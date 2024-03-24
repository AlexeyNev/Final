package org.example.Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder stringBuilder4 = new StringBuilder("D");

        StringBuilder [] array = {stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);


    }
}
