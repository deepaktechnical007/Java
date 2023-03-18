import java.util.Scanner;

public class dpk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        int n = 5;
        int i, j, k;
        for (i = 0; i < n; i += 2) {

            k = i * n + 1;
            for (j = 0; j < n; j++) {

                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        for (i = 4; i > 0; i -= 2) {
            k = (i - 1) * n + 1;
            for (j = 1; j <= n; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();

        }
    }
}