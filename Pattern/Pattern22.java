public class Pattern22 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
