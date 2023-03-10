class linearSearch {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 1, 2, 4, 6 };
        int item = 2;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == item) {
                System.out.print("Item is present at " + i + " index position");
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.print("Item is not found");
        }

    }
}