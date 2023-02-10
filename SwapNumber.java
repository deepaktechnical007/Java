import java.util.Scanner;

public class SwapNumber {
      public static void main(String[] args) {
         System.out.print("Enter the value of x : ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of y : ");   
        int b = sc.nextInt();

        int c = a;
            a = b;
            b = c;

            System.out.println("After swapping x : "+a);
            System.out.println("After swapping y : "+b);
      
    }
}