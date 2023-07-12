package in;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add(20);
        hs.add(10);
        hs.add(40);
        hs.add(60);

        System.out.println(hs);

        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
