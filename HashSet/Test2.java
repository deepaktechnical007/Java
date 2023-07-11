package in.sp;

import java.util.HashSet;

public class Test2 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("deepak");
        hs.add(100.34);
        hs.add("xyz");
        hs.add(true);
        hs.add(null);
        hs.add("deepak");
        hs.add(10);
        hs.add(null);

        System.out.println(hs);
    }
}
