package Methods;

public class Testttt extends Thread {

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
        Testttt t1 = new Testttt();
        t1.run();

        Testttt t2 = new Testttt();
        t2.run();
    }
}
