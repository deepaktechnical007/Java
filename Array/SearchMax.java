public class SearchMax {

    public static void main(String[] args) {

        int[] a = { 2, 3, 5, 4, 9, 6, 7 };
        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            if (max < a[i]) {

                max = a[i];

            }
        }
        System.out.print("Maximum element is " + max);

    }
}
