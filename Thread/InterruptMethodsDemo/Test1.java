package InterruptMethodsDemo;

public class Test1 extends Thread {

    public void run() {

        // System.out.println("b1 :" + Thread.currentThread().isInterrupted());
        // System.out.println("b1 :" + Thread.currentThread().isInterrupted())
        System.out.println("A :" + Thread.interrupted());

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println("B :" + Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println("Thread interrupt :-" + e);
        }
    }

    public static void main(String[] args) {

        Test1 t2 = new Test1();
        t2.start();
        t2.interrupt();
    }
}
