public class Pattern11 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 9; j > (i * 2); j--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
