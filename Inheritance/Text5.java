public class Text5 {

    void show() {
        System.out.println("1");
    }
}

class xyz extends Text5 {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Text5 t = new Text5();
        t.show();

        xyz ob = new xyz();
        ob.show();
    }
}
