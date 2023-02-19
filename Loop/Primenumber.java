import java.util.Scanner;

public class Primenumber {
    public static void  main(String aags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        int temp=0;

        for(int i = 2; i <=n-1; i++){

            if(n%i == 0){
            temp =temp+1;
            }
        }
         if(temp>0){
          System.out.println(n +" Number is not prime");
        }else{
        System.out.println(n +" Number is prime");
            }
  }
}