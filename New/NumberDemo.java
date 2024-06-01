package array.numbers;

import java.util.Scanner;

public class NumberDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is a postive Number");
        } else {
            System.out.println(n + " is a negative Number");
        }
    }
}
