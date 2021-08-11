package Week1.Day2;

public class ChangeOddToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		char[] charArr = test.toCharArray();

		for (int i = 0; i < charArr.length; i++) {

			if (i % 2 == 0) {

				System.out.print(Character.toUpperCase(charArr[i]));
			} else
				System.out.print(charArr[i]);
		}

		{

		}
		/*
		 * Pseudo Code
		 * 
		 * Declare String Input as Follow
		 * 
		 * String test = "changeme";
		 * 
		 * a) Convert the String to character array
		 * 
		 * b) Traverse through each character (using loop)
		 * 
		 * c)find the odd index within the loop (use mod operator)
		 * 
		 * d)within the loop, change the character to uppercase, if the index is odd
		 * else don't change
		 * 
		 */
	}

}
