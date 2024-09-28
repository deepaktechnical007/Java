import java.util.Scanner;

public class FibonacciSeriesUsingRec{

    static int a=0,b=1,c;
    public static void main (String [] args){
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter the number : ");
     int i =sc.nextInt();
        System.out.print(a+","+b);
        FibonacciSeriesUsingRec ob = new FibonacciSeriesUsingRec();
        ob.printFib(i);
    }

   void printFib(int i)
 {
      if(i>=1){

         c=a+b;
         System.out.print(","+c);
         a=b;
         b=c;
         printFib(i-1);
      }
 }
}