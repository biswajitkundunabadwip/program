package recursions;

public class FibbonaciNumber {

	public static int fibbonaciNumber(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		return fibbonaciNumber(n-1)+fibbonaciNumber(n-2);
	}
	
	public static void main(String[] args) {
		int values=fibbonaciNumber(7);
		System.out.println(values);
	}
}
