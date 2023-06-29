import java.util.ArrayList;

public class CollectionDemo4 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");

        ArrayList al2 = new ArrayList();

        al2.add("bbb");
        al2.add("ddd");
        al2.add("eee");

        al.removeAll(al2);

        System.out.println(al);
        System.out.println(al2);
    }
}
