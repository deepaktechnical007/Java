package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(10);
        l.add("deepak");
        l.add("rahul");

        ListIterator li = l.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("-------------------");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
