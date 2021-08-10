package Week1.Day2;

public class CharOccurence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai eegfd ee";

		int count = 0;
		char strArr[] = str.toCharArray();

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == 'e') {
				count = count + 1;

			}

		}
		System.out.println(count);

		// declare and initialize a variable count to store the number of occurrences

		// convert the string into char array

		// get the length of the array

		// traverse from 0 till the array length

		// Check the char array has the particular char in it

		// if is has increment the count

		// print the count out of the loop

	}

}
