package CollectionDemo.demo;

import java.util.*;

public class SetDemo1 {

    public static void main(String[] args) {

        Set s = new HashSet();

        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(null);
        s.add(null);
        s.add(300);

        System.out.println(s);
    }
}
