package org.example;

public class Test extends Thread {
    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }

    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "..");
        }
    }
}
