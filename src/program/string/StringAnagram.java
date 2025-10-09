package program.string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fixed input strings
		String str1 = "listen ";
		String str2 = " silent";

		// Remove leading and trailing spaces, then convert to lowercase
		str1 = str1.trim().toLowerCase();
		str2 = str2.trim().toLowerCase();

		// Check if lengths are same
		if (str1.length() != str2.length()) {
			System.out.println("Not an anagram.");
			return;
		}

		// Convert to character arrays and sort
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare sorted arrays
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("Not an anagram.");
		}
	}

}
