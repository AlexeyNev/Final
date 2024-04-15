package multithreading;

/*
setName - установка имени потока
setPriority - установка приоритета потока (10 максимум)
 */
public class Example4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Мой поток 5");
        myThread5.setPriority(9);

        System.out.println("Name of myThread5 = " + myThread5.getName() +
        " priority of myThread5 = " + myThread5.getPriority());


    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

