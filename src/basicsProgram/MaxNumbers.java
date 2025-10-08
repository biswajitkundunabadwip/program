package basicsProgram;

public class MaxNumbers {
	public static void main(String[] args) {
		int x=30,y=90;
		
		/**
		 * Using normal loop
		 */
		
		if(x>y) {
			System.out.println("the largest number is : "+x);
		}else {
			System.out.println("the largest number is : "+y);
		}
		
		/**
		 * Using ternary operation
		 */
		int largestNumber=x>y?x:y;
		
		System.out.println("the largest number using ternary operator is : "+largestNumber);
	}
}
