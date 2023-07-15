package in.sp.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(101, "deepak");
        map.put(102, "amit");
        map.put(103, "rahul");
        map.put(104, "deepak");

        System.out.println(map);

    }
}