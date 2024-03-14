import java.util.HashMap;

public class Hashing1 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // Search
        if (map.containsKey("India")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }
    }
}
