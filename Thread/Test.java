package ThreadYieldDemo;

public class Test extends Thread {
    public void run() {

        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();

        // Thread.yield();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}