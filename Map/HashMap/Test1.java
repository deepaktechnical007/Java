package sp.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101, "deepak");
        hm.put(102, "amit");
        hm.put(103, "rahul");
        hm.put(104, "ayush");

        System.out.println(hm);

        Set set = hm.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}