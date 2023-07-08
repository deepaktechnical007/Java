package CollectionDemodemo2;

import java.util.Vector;

public class CollectionDemo2 {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.add("deepak");
        v.add("rahul");
        v.add("amit");
        v.add(100);
        v.add(2.34);
        v.add('a');

        System.out.println(v.remove("deepak"));
        System.out.println(v);
    }
}
