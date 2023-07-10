package CollectionDemo3;

import java.util.Stack;

public class CollectionDemo2 {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("deepak");
        s.push("amit");
        s.push(200);
        s.push(100.10);

        System.out.println(s);
        System.out.println(s.search(200));
    }
}
