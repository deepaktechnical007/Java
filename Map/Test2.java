package in.sp.demo;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(101, "deepak");
        map.put(102, "amit");
        map.put(103, "rahul");
        map.put(104, "deepak");
        map.put(102, "raj");
        map.put(null, "aaa");
        map.put(105, "bbb");

        System.out.println(map);

    }
}