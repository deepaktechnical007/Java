import java.util.Arrays;

public class ElementFrequency {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 2, 3, 2, 6, 7, 2 };
		Arrays.sort(arr);
		int i;
		int count = 1;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i] + "comes" + count + "times");
				count = 1;
			}
		}
		System.out.println(arr[i] + "comes" + count + "times");
	}
}
