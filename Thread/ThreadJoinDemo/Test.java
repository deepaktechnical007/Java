package ThreadJoinDemo;

public class Test extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Test t = new Test();
        t.start();

        t.join();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}