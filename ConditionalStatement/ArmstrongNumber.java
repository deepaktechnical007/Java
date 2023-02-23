import java.util.Scanner;

public class ArmstrongNumber {
    
    public static void main(String[] args){
        System.out.print("Enter the number : ");
          Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int t1=num;
        int leng=0;
        while(t1 !=0){

            leng=leng+1;
            t1=t1/10;
        }
        int t2=num;
        int arm=0;
        int rem;
        while(t2 !=0){
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==num){
            System.out.println(num+" is armstrong");
        }else{
            System.out.println(num+" is not armstrong");
        }

    }
}
