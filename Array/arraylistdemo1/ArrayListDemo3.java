package arraylistdemo1;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList al2 = new ArrayList();

        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);

        System.out.println(al2.indexOf(50));
    }
}