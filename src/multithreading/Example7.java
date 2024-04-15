package multithreading;

public class Example7 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500);
        System.out.println("Main ends");

    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}