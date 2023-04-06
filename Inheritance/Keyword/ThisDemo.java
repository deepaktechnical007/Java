package Keyword;

public class ThisDemo {

    int i;

    void setvalue(int i) {
        this.i = i;

    }

    void show() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisDemo t = new ThisDemo();
        t.setvalue(100);
        t.show();
    }
}
