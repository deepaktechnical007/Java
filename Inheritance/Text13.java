public class Text13 {

    synchronized void show() {
        System.out.println("1");
    }
}

class xyz extends Text13 {

    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Text13 t = new Text13();
        t.show();

        xyz ob = new xyz();
        ob.show();
    }
}
