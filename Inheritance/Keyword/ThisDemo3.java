package Keyword;

public class ThisDemo3 {

    void m1(ThisDemo3 td) {
        System.out.println("i am in m1 method");
    }

    void m2() {
        m1(this);
    }

    public static void main(String[] args) {
        ThisDemo3 td = new ThisDemo3();
        td.m2();
    }
}
