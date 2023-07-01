package CollectionDemo.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

  public static void main(String[] args) {

    List l = new ArrayList();

    l.add(0, 10);
    l.add(1, 20);
    l.add(30);
    l.add(40);
    l.add(null);
    l.add(null);

    System.out.println(l);

  }
}
