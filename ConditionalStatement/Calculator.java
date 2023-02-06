import java.util.Scanner;

public class  Calculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int b = sc.nextInt();
		System.out.println("Press 1 Sum");
		System.out.println("Press 2 Subtraction");
		System.out.println("Press 3 Multiplication");
		System.out.println("Press 4 Division");
		System.out.println("Press 5 remainder");
        System.out.print("Enter the number : ");
		int operator =sc.nextInt();

		switch (operator){
			case 1 : System.out.println(a+b);
			break;
			case 2 : System.out.println(a-b);
			break;
			case 3 : System.out.println(a*b);
			break;
			case 4 : if(b == 0){
				System.out.println("Invaild Division");
			} else{
				System.out.println(a/b);
				break;
			}
			case 5 : if(b == 0){
				System.out.println("Invaild Division");
            }else{
				System.out.println("a%b");
			}
            break;
			default : System.out.println("Invaild Operator");
		}
	}
}