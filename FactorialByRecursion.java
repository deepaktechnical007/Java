import java.util.Scanner;

public class FactorialByRecursion {

    static int fact =1;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        FactorialByRecursion ob =new FactorialByRecursion();
        ob.calcfact(num);
        System.out.println("factorial of "+num+" is "+fact);
     }
 


void calcfact(int num){

    if(num>=1){
        fact=fact*num;
        calcfact(num-1);
    }
  }
} 