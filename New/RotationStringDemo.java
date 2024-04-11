package data;

public class RotationStringDemo {

    public static void main(String[] args) {

        System.out.println(isRotationVersion("abcd", "bcda"));
    }

    public static boolean isRotationVersion(String str, String rotationString) {

        boolean isRotated = false;

        if ((str == null) || rotationString == null) {
            return false;
        } else if (str.length() != rotationString.length()) {
            return false;
        } else {
            String concatenated = str + str;
            return concatenated.contains(rotationString);
        }
    }
}
