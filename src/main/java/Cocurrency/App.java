package Cocurrency;

class Runner1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1: " + i);
        }
    }
}

class Runner2 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Runner2: " + i);
        }
    }
}

public class App {

    public static void main(String[] args) {
        Runner1 t1 = new Runner1();
        Runner2 t2 = new Runner2();
        t1.start();
        t2.start();

        try {
            t1.join();
//            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finished threads");
    }
}
