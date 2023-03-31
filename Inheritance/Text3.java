public class Text3 {

    void show(Object a) {
        System.out.println("Object method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Text3 t = new Text3();
        t.show("abc");
    }
}
