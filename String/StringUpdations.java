public class StringUpdations {

    public static void main(String[] args) {

        String s1 = "this is demo";

        System.out.println(s1.replace("is", "was"));
        System.out.println(s1.replaceFirst("is", "was"));
        System.out.println(s1.replaceAll("is", "was"));
        System.out.println(s1.replaceAll("is(.)", "was"));
        System.out.println(s1.replaceAll("is(.*)", "was"));
    }
}
