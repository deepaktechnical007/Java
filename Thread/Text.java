package mtdemo;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("task 1");
    }
}

public class Text {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
