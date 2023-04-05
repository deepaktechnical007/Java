package Keyword;

public class Test {

    int i;

    void setvalue(int i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

class XYZ {
    public static void main(String[] args) {
        Test t = new Test();
        t.setvalue(10);
        t.show();
    }
}
