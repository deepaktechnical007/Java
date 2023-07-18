package sp.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap();

        hm.put(101, "deepak");
        hm.put(102, "amit");
        hm.put(103, "rahul");
        hm.put(104, "ayush");

        System.out.println(hm);

        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey() + " -> " + me.getValue());
        }

    }
}