public class Test9 {

    public static void main(String[] args) {

        Test9 t = new Test9();
        try {
            t.divide();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    void divide() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }
}
