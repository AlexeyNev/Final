package org.example.QueueInterfaceEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Alex");
        queue.add("Alla");
        queue.add("Mars");
        queue.add("Petr");
        queue.add("Ilya");
        System.out.println(queue);

//        queue.poll();

        System.out.println(queue.element());
    }
}
