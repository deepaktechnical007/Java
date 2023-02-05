import java.util.Scanner;

public class findlargestoftwogivennumbers{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first value : ");
    int a= sc.nextInt();
    System.out.print("Enter the second value : ");
    int b= sc.nextInt();

    if(a == b){
        System.out.println("both are equal");
    }
    else if(a>b){
        System.out.println("a greater than B");
    }
    else{
        System.out.println("b is greater than a");
    }
}
}