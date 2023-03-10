public class SearchMin {

    public static void main(String[] args) {

        int[] a = { 2, 4, 5, 1, 6, 7, 8, 9 };
        int min = a[0];

        for (int i = 1; i < a.length; i++) {

            if (min > a[i]) {

                min = a[i];
            }
        }
        System.out.print("Minmum element is " + min);
    }
}
