public class FindCommanArray {

    public static void main(String[] args) {

        int[] arr1 = { 2, 5, 7, 8, 4, 9 };
        int[] arr2 = { 3, 5, 6, 9, 0, 1 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + ", ");
                    break;
                }
            }
        }
    }
}
