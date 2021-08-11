package Week1.Day2;

public class FindTypes {

	public static void main(String[] args) {

		// Here is the input
		String test = "1$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		char[] strArr = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (Character.isLetter(strArr[i])) {
				letter = letter + 1;
			} else if (Character.isDigit(strArr[i])) {
				num = num + 1;
			} else if (Character.isSpaceChar(strArr[i])) {
				space = space + 1;

			} else
				;

			specialChar = specialChar + 1;

		}
		System.out.println("specialCharcter: " + specialChar);
		System.out.println("letter: " + letter);
		System.out.println("num: " + num);
		System.out.println("space: " + space);

	}

	/*
	 * Pseudo Code: a) Convert the String to character array b) Traverse through
	 * each character (using loop) c) Find if the given character is what type using
	 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
	 * iv) else -> consider as special character
	 */

	// Print the count here
	/*
	 * System.out.println("letter: " + letter); System.out.println("space: " +
	 * space); System.out.println("number: " + num);
	 * System.out.println("specialCharcter: " + specialChar);
	 */

}
