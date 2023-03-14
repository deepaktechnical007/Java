public class FindDuplicateElement {
    // Brute force method

    public static void main(String[] args) {

        int[] a = { 2, 5, 8, 9, 4, 3, 9, 5 };

        System.out.print("Duplicate value are : ");

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.print(a[i] + ",");
                }
            }
        }
    }
}
