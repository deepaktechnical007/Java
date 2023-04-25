package Stringbufferdemo;

public class Stringbufferdemo1 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("hello");
        System.out.println(sb.capacity());

        sb.append("deepak javaa");
        System.out.println(sb.capacity());

    }
}
