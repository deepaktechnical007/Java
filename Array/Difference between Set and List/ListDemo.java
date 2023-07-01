package CollectionDemo.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        
        List l=new ArrayList();

        l.add(0, 10);
        l.add(1, 20);
        l.add(30);
        l.add(40);

        System.out.println(l);
    }
}
