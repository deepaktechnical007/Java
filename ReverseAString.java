import java.util.Scanner;

public class ReverseAString {
    
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
      String name = sc.nextLine();
      int leng = name.length();
      String rev = "";

      for(int i = leng-1; i>=0; i-- ){

        rev = rev+name.charAt(i);

      }
       System.out.println("reverse of "+name+ " is "+ rev);
    
    }
}
