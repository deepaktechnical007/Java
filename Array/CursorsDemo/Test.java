package Demo;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.add(10);
        v.add("deepak");
        v.add(15.3);

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}
