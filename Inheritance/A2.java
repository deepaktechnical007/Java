public class A2 {

    void showA2() {
        System.out.println("A class method");
    }
}

class B extends A2 {
    void showb() {
        System.out.println("B class method");
    }

}

class C extends A2 {
    void showC() {
        System.out.println("C class method");
    }

    public static void main(String[] args) {
        A2 ob1 = new A2();
        ob1.showA2();
        System.out.println("___________________");
        B ob2 = new B();
        ob1.showA2();
        ob2.showb();
        System.out.println("___________________");
        C ob3 = new C();
        ob3.showA2();
        ob3.showC();
    }
}
