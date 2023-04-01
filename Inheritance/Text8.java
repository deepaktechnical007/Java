interface l1 {
    void display1();
}

abstract class Text8 {

    abstract void display1();

    void show() throws RuntimeException {
        System.out.println("1");
    }
}

class xyz implements l1 {

    public void display1() {

    }

    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {

        xyz ob = new xyz();
        ob.show();
    }
}
