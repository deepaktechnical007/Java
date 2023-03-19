public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] a = { 4, -2, -3, 4, -1, -2, 1, 5, -4 };

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        int start = 0, end = 0, s = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        System.out.println(max_so_far);
        System.out.println("Starting index position of sub array is " + start + " and ending index position is " + end);
    }
}
