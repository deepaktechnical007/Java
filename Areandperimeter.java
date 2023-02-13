import java.util.Scanner;

public class Areandperimeter {
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        //Find Area And Perimeter of Rectangle
        System.out.print("Enter the lengh value : ");
        int a = sc.nextInt();
        System.out.print("Enter the breadth value : ");
        int b = sc.nextInt();

       System.out.println("Area of rectangle is : "+a*b);
       System.out.println("Perimeter of rectangle is : " +2*(a + b));
    }
}
