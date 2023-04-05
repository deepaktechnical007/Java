class InterfaceI2 {

    public void show() {
    }
}

abstract class InterfaceI3 {
    public abstract void display();
}

class Test1 implements I2, I3 {
    public void show() {
        System.out.println("1");
    }

    public void display() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();
        t.display();
    }
}