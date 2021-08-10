package Week1.Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		int len1 = text1.length();
		int len2 = text2.length();

		if (len1 == len2) {
			char text1Arr[] = text1.toCharArray();
			char text2Arr[] = text2.toCharArray();
			Arrays.sort(text1Arr);
			Arrays.sort(text2Arr);

			if (Arrays.equals(text1Arr, text2Arr)) {

				System.out.println("Yes they are anagram");

			} else
				System.out.println("No they are not anagram");
//			
			/*
			 * Pseudo Code
			 * 
			 * Declare a String String text1 = "stops"; Declare another String String text2
			 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
			 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
			 * the arrays has same value
			 * 
			 */

		}

	}
}
