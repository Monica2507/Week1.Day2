package Week1.Day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// Sort the array
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			if (i != arr[i] - 1) {
				System.out.println(arr[i] - 1);
				break;
			}

		}
		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

	}

}
