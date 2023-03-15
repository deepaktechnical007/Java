public class FirstDuplicateElement {

    public static void main(String[] args) {

        int[] a = { 4, 6, 8, 5, 7, 3, 2, 8, 9, 5, 2 };

        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    temp = temp + 1;
                    System.out.print("First duplicate element is " + a[i]);
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }

    }
}
