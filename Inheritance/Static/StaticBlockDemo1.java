package Static;

public class StaticBlockDemo1 {

    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        System.out.println("i am in main method");
    }

    static {
        System.out.println("i am second static block");
    }
}
