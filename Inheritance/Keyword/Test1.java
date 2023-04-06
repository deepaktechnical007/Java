package Keyword;

class Test1 {
    Test1(ThisDemo4 td) {
        System.out.println("test class constructor");
    }
}

class ThisDemo4 {

    void m1() {
        Test1 t = new Test1(this);
    }

    public static void main(String[] args) {
        ThisDemo4 t = new ThisDemo4();
        t.m1();
    }

}