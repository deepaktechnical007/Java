package mtdemo;

class MyThread2 extends Thread {

    public void run() {
        System.out.println("playing music");
    }
}

class MyThread3 extends Thread {

    public void run() {
        System.out.println("playing video");
    }
}

class MyThread4 extends Thread {

    public void run() {
        System.out.println("progress bar is executing");
    }
}

class MyThread5 extends Thread {

    public void run() {
        System.out.println("timer is executing");
    }
}

public class Textt {

    public static void main(String[] args) {

        MyThread2 thread2 = new MyThread2();
        thread2.start();

        MyThread3 thread3 = new MyThread3();
        thread3.start();

        MyThread4 thread4 = new MyThread4();
        thread4.start();

        MyThread5 thread5 = new MyThread5();
        thread5.start();

    }
}
