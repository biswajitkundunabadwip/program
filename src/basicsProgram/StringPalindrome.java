package basicsProgram;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";

		// Reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		// Compare original and reversed string
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}

}
