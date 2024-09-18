import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class LeapYear {

    public static void main(String [] ards){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = sc.nextInt();

        if (year % 4 ==0){

            if (year % 100 == 0);
            {
                if(year % 400 == 0){
                    System.out.println("leap year");
                }else{
                    System.out.println("not a leap year ");
                }
            }{
                
            }else(){
            System.out.println("leap year ");
            }  
       }else{
            System.out.println("not a leap year ");
        }

    }
}
