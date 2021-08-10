package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// Build a logic to find the given string is palindrome or not

		String str = "madam";
		String rev = "";
		int length = str.length();
		for (int i = length-1 ; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("the given string is a palindrome");
		} else
			System.out.println("the given string is not a palindrome");
		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */

	}

}
