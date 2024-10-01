import java.util.HashMap;

public class Hashing {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);
    }
}
