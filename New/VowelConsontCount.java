package data;

public class VowelConsontCount {

    public static void main(String[] args) {

        String str = "Deepak";

        CountVowels(str);

    }

    private static void CountVowels(String str) {

        int vowelcount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                ++vowelcount;
            } else {
                ++consonantCount;
            }
        }
        System.out.println("Vowel Count=" + vowelcount);
        System.out.println("Consonant Count=" + vowelcount);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}