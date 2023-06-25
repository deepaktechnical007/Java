package Methods;

public class Babu {

    public static void main(String[] args) {

        int arr[] = { 1, 0, 1, 0, 0, 1, 0, 1 };

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int CurrentLeftElement = arr[i];
            int CurrentRightElement = arr[j];
            if (CurrentLeftElement == 0) {
                i++;
            }
            if (CurrentRightElement == 1) {
                j--;
            }
            if (CurrentLeftElement == 1 && CurrentRightElement == 0) {
                arr[i] = CurrentRightElement;
                arr[j] = CurrentLeftElement;
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
