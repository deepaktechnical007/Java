import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number :");
       int a = sc.nextInt();
       System.out.print("Enter the second number :");
       int b = sc.nextInt();
       System.out.print("Enter the third number :");
       int c = sc.nextInt();


       if(a > b && a > c){
        System.out.println(a+" is greater number ");
       }else if(b > c){
        System.out.println(b+" is greater number ");
       }else
       System.out.println(c+" is greater number ");
    }
}
