public class Text4 {

    void show(int a) {
        System.out.println("int method");
    }

    void show(int... a) {
        System.out.println("varargs method");
    }

    public static void main(String[] args) {
        Text4 t = new Text4();
        t.show(10, 20);
    }
}
