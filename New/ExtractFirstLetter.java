package data;

public class ExtractFirstLetter{

    public static void main(String[] args) {
        
        String str="My name is Deepak";
        splitWords(str);
    }

    private static void splitWords(String str) {
    
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){

            String s=words[i];
            System.out.println(s.charAt(0));
        }
    }
}