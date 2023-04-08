public class ThisDemo4 {

    ThisDemo4 m1() {
        return this;
    }

    public static void main(String[] args) {
        ThisDemo4 t = new ThisDemo4();
        t.m1();
    }
}
