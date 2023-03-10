public class LinearSearchString {

    public static void main(String[] args) {

        String[] arr = { "Deepak", "Babu", "Amit", "Ajay", "Rohit", "Rahul" };
        String item = "Babu";
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(item)) {
                System.out.print("Item present in " + i + " index position");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.print("Item is not found");
        }
    }
}
