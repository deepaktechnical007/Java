public class A1 {

    void showA() {
        System.out.println("A class method");
    }
}

class B extends A1 {
    void showb() {
        System.out.println("B class method");
    }

}

class C extends B {
    void showC() {
        System.out.println("C class method");
    }

    public static void main(String[] args) {
        A1 ob1 = new A1();
        ob1.showA();
        System.out.println("___________________");
        B ob2 = new B();
        ob1.showA();
        ob2.showb();
        System.out.println("___________________");
        C ob3 = new C();
        ob3.showA();
        ob3.showb();
        ob3.showC();
    }
}
