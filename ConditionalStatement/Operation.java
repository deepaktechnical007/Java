import java.rmi.NoSuchObjectException;
import java.util.Scanner;
class  Operation{
      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int rem = a%b;
        int div = a/b;
        if( a + b == add ){
            System.out.println("Sum of a and b : " +add);
        }if( a - b == sub ){
            System.out.println("Subtraction of a and b : " +sub);
        }if( a * b == mul ){
            System.out.println("Multiplication of a and b : " +mul);
        }if( a / b == div ){
            System.out.println("Division of a and b : " +div);
        }if( a % b == rem ){
            System.out.println("remainder of a and b : " +rem);
        }
         
    }
}