public class Pattern26 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 3; j++) {
                    a = a + 1;
                    System.out.print(a + " ");
                }
            } else {
                int temp = a + 1;
                for (int j = a + 3; j >= temp; j--) {
                    a = a + 1;
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
