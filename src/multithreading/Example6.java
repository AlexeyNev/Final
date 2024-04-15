package multithreading;

public class Example6 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

     public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRun1());
        Example6 thread2 = new Example6();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Конец");
    }
}

class MyRun1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}