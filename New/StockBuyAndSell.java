package data;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int array[] = { 10, 30, 40, 70, 90, 120 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];

            }
            if (array[i] - min > max) {

                max = array[i] - min;
            }
        }
        System.out.println("Max Value =" + max);
    }
}
