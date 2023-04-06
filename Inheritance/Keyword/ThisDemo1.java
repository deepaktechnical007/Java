package Keyword;

public class ThisDemo1 {

    void display() {
        System.out.println("hello");
    }

    void show() {
        this.display(); // display();
    }

    public static void main(String[] args) {

        ThisDemo1 td = new ThisDemo1();
        td.show();
    }
}
