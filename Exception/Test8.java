public class Test8 {

    public static void main(String[] args) {

        try {
            int a = 100, b = 2, c;
            c = a / b;
            System.out.println(c);
        } finally {
            System.out.println("i am in finally block");
        }
    }
}
