class A1 {

    void m1() {
        System.out.println("i am class b");
    }
}

class B extends A1 {
    void m1() {
        System.out.println("i am class c");
    }

    void show() {
        // m1();
        super.m1();
    }

    public static void main(String[] arg) {
        B ob = new B();
        ob.show();
    }
}
