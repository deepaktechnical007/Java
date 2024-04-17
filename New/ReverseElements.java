package data;

import java.util.Stack;

public class ReverseElements {

    public static void main(String[] args) {

        Stack stack = new Stack();

        int arr[] = { 1, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
