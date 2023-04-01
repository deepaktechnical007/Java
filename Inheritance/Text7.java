public class Text7 {

    void show() throws RuntimeException {
        System.out.println("1");
    }
}

class xyz extends Text7 {
    void show() throws RuntimeException {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Text7 t = new Text7();
        t.show();

        xyz ob = new xyz();
        ob.show();
    }
}
