import java.util.Scanner;
public class Fibonacci {

 public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Plase enter a number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        
// 0,1,1,2,3,5
        System.out.print("Fibonacci Series till " + n + " terms : ");
       // dry run execute initialization
       // 1 initialization
       // 2 condition 
       //3 increment/decrement
        for(int i = 1; i<= n; i++)
        {

           c = a + b;//1 2 3 5 8
           System.out.print(a +", ");// 0 1 1 2 3
            a = b; // 1 1 2 3 5
           b = c; // 1 2  3 5 8
           
           
        }
  }
} 


