public class Text2 {

    void show(int a) {
        System.out.println("int method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Text2 t = new Text2();
        t.show('a');

    }
}
