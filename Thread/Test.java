package Methods;

public class Test extends Thread {
    public void run() {
        System.out.println("thread task : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("hello : " + Thread.currentThread().getName());

        Test t1 = new Test();
        t1.setName("Deepak");
        t1.start();

        Test t2 = new Test();
        t2.setName("smart programming");
        t2.start();
    }
}
