public class BinarySearch {

    public static void main(String[] args) {

        int[] a = { 1, 3, 4, 5, 7, 8, 9, 12, 14, 17, 19, 20 };
        int search = 9;
        int li = 0;
        int hi = a.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {

            if (a[mi] == search) {

                System.out.print("Element is at " + mi + " index position");
                break;
            } else if (a[mi] < search) {
                li = mi + 1;
            } else {

                hi = mi - 1;
            }

            mi = (li + hi) / 2;
        }
        if (li > hi) {

            System.out.print("Element is not found");
        }
    }
}
