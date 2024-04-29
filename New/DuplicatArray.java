package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatArray {

    public static void main(String[] args) {

        int array[] = { 10, 20, 40, 50, 10, 40, 50 };

        bruteForce(array);
        extraMemory(array);
    }

    private static void extraMemory(int[] array) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {

            if (set.contains(array[i])) {
                System.out.println("Duplicate element EM=" + array[i]);
            } else {
                set.add(array[i]);
            }
        }
    }

    private static void bruteForce(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate Element =" + array[i]);
                }
            }
        }
    }
}
