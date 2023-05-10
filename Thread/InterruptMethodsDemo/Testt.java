package InterruptMethodsDemo;

public class Testt extends Thread {

    public void run() {

        System.out.println("b1 :" + Thread.currentThread().isInterrupted());
        System.out.println("b1 :" + Thread.currentThread().isInterrupted());

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

        Testt t1 = new Testt();
        t1.start();
        t1.interrupt();
    }
}
