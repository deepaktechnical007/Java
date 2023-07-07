package LinkedList;

import java.util.LinkedList;

public class CollectionDemo2 {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.add("deepak");
        l1.add("rahul");
        l1.add(200);
        l1.add(400);
        l1.add('b');

        System.out.println(l1);

        l1.addLast("sss");

        System.out.println(l1);

    }

}
