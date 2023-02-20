import java.util.Scanner;

public class SwapTwoNumber {
    
    public static void main (String [] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a : ");
      int a =sc.nextInt();
      System.out.print("Enter the value of b : ");
      int b =sc.nextInt();
        
       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("After swapping a :"+a);
       System.out.println("After swapping b :"+b);
    }
}
