import java.util.Scanner;

public class Loop {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of table: ");
      int n =sc.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(i*n);
        }
    }
}
