class A {

    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {
    void showb() {
        System.out.println("B class method");
    }

    public static void main(String[] args) {
        A ob1 = new A();
        ob1.showA();

        B ob2 = new B();
        ob1.showA();
        ob2.showb();
    }
}