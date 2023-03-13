public class KthLargestElement {

    public static void main(String[] args) {

        int k = 4;
        int[] a = { 2, 3, 5, 7, 8, 0, 22, 12, 34, 71, 56, 38 };

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            if (i == k - 1) {
                System.out.println(k + " Largest element is " + a[i]);
                break;
            }
        }
        System.out.println("------------");

        for (int l = 0; l < a.length; l++) {

            System.out.print(a[l] + " ");

        }

    }
}
