import java.util.Scanner;

class OddEven{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("This number is Even");
        }else{
            System.out.println("This number is Odd");
        } 
    }
}