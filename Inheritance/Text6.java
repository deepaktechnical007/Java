public class Text6 {

    public void show() {
        System.out.println("1");
    }
}

class xyz extends Text5 {
    public void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Text6 t = new Text6();
        t.show();

        xyz ob = new xyz();
        ob.show();
    }
}
