package Keyword;

public class ThisDemo2 {

    ThisDemo2() {
        this(10);
        System.out.println("no arg constructor");
    }

    ThisDemo2(int a) {
        System.out.println("parmetrised constructor");
    }

    public static void main(String[] args) {

        ThisDemo2 td = new ThisDemo2();
    }
}
