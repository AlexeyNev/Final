package multithreading;

public class Example2 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        myThread1.start();
        myThread2.start();

    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <=100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}