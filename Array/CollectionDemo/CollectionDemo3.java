import java.util.ArrayList;

public class CollectionDemo3 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);

        System.out.println(al);

        al.remove(1);
        System.out.println(al);

    }
}
