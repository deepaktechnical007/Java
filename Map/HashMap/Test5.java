package sp.HashMap;

import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101, "deepak");
        hm.put(102, "amit");
        hm.put(105, "ravi");
        hm.put(103, "rahul");
        hm.put(104, "ayush");
        hm.put(103, "deepak");

        hm.put(null, "aaa");

        System.out.println(hm);
    }
}