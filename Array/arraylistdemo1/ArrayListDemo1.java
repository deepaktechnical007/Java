package arraylistdemo1;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al2 = new ArrayList();

        al2.add(10);
        al2.add(20);
        al2.add(30);

        ArrayList al1 = new ArrayList(al2);

        System.out.println(al1);
    }
}