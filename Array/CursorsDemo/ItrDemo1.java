package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo1 {

    private static final List I = null;

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(10);
        l.add("deepak");
        l.add("rahul");

        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        l.remove("rahul");
        System.out.println(l);
    }
}
