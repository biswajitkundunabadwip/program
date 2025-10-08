package basicsProgram;

public class NumberPalindrome {
public static void main(String[] args) {
	int number=12345;
	int originalNumber=number;
	int reverseNumber=0;
	
	while(number!=0) {
		int digit=number%10;
		reverseNumber=reverseNumber*10+digit;
		number=number/10;
	}
	
	if(originalNumber==reverseNumber) {
		System.out.println("number is pallindrome");
	}else {
		System.out.println("number is not palindrome");
	}
}
}
