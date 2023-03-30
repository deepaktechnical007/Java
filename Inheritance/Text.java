public class Text {
    void show(int a) {
        System.out.println("1");
    }

    void show(String b) {
        System.out.println("2");
    }

    public static void main(String[] args) {

        Text t = new Text();
        t.show("babu");

    }
}
