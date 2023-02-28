public class Pattern17 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 5; k++) {
                if (i == k || i + k == 5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
