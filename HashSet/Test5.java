package in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test5 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add("deepak");
        al.add("rahul");
        al.add("amit");

        HashSet hs = new HashSet();

        hs.addAll(al);
        hs.add(10);
        hs.add(40);
        hs.add(60);

        System.out.println(hs.contains("deepak"));
        System.out.println(hs);

    }
}
