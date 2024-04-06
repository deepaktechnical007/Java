package data;

import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {

        String str = "abadab";
        System.out.println(Longest(str));
    }

    private static String Longest(String str) {

        HashSet<Character> set = new HashSet<>();
        String LongestOverall = "";
        String LongestTillnow = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                LongestTillnow = "";
                set.clear();
            }
            LongestTillnow += c;
            set.add(c);

            if (LongestTillnow.length() > LongestOverall.length()) {
                LongestOverall = LongestTillnow;
            }
        }
        return LongestOverall;
    }
}
