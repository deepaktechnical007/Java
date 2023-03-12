public class SecondSmallest1 {

    public static void main(String[] args) {

        int[] a = { 5, 7, 2, 11, 9, 1, 3, 6 };
        int temp;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            if (i == 1) {

                break;
            }

        }
        for (int k = 0; k < a.length; k++) {

            System.out.print(a[k] + " ");

        }

        System.out.println("Second smallest number is " + a[1]);

    }
}
