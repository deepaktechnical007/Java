package data;


public class EvenWordDemo {
 
    public static void main (String [] args){

        String str="Hell World we lol";

        for(String s : str.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    } 
}
