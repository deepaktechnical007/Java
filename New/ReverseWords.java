package data;

import java.util.Stack;

public class ReverseWords {

    static void reverseWords(String str) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {

                st.push(str.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.println(st.pop());
                }
            }
        }
        System.out.println(" ");

        while (st.empty()==false) {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {

        reverseWords("Hello world");
    }
}
