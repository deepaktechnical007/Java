package mtdemo;

public class ThreadNameDemo1 {

    public static void main(String[] args) {

        System.out.println("hello");
        Thread.currentThread().setName("deepak");
        System.out.println(10 / 0);
    }
}
