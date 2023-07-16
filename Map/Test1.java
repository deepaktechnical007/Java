package in.sp.demo;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(100, "deepak");
        map.put(102, "amit");
        map.put(103, "rahul");

        System.out.println(map.containsKey(105));

        System.out.println(map.containsValue("map"));

        System.out.println(map.get(102));

        map.remove(102);
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map);

    }
}
