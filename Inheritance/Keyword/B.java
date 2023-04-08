class B {

    B() {
        System.out.println("i m in class B");
    }
}

class C extends B {
    C() {
        System.out.println("i m in class C");
    }

    public static void main(String[] args) {
        C ob = new C();
    }
}