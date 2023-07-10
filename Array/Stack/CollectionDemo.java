package CollectionDemo3;

import java.util.Stack;

public class CollectionDemo {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("deepak");
        s.push("amit");
        s.push(200);
        s.push(100.10);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
