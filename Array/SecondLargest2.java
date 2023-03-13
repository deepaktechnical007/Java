public class SecondLargest2 {

    public static void main(String[] args) {

        int[] a = { 7, 3, 6, 2, 8, 9, 11, 25, 24, 34 };

        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                Second_largest = largest;
                largest = a[i];
            } else if (a[i] > Second_largest && a[i] != largest) {
                Second_largest = a[i];
            }
        }
        if (Second_largest == Integer.MAX_VALUE) {
            System.out.println("these is no second largest element in the list");
        } else {
            System.out.println("Second largest value is " + Second_largest);
        }
    }
}
