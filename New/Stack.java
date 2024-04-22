package data;

public class Stack {

    int array[] = new int[5];
    int top = 0;

    private boolean push(int x) {
        top++;
        array[top] = x;
        System.out.println("Element pushed in to stack=" + x);
        return true;
    }

    private int pop() {
        int x = array[top--];
        System.out.println("Element popped from stack=" + x);
        return x;
    }

    private int peek() {
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        System.out.println("Printing the top most value=" + stack.peek());

    }
}
