package Methods;

public class Testtt extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Testtt t1 = new Testtt();
        t1.start();

        Testtt t2 = new Testtt();
        t2.start();
    }
}
