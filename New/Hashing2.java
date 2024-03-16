import java.util.HashMap;
import java.util.Map;

public class Hashing2 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}