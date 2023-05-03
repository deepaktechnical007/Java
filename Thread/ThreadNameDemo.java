package mtdemo;

public class ThreadNameDemo {

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("deepak");
        System.out.println("New Thread Name : " + Thread.currentThread().getName());
    }
}
