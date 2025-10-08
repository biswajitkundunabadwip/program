package recursions;

public class SumOfArray {
	int arr[] = { 1, 2, 3, 4};

	public int sumOfArray(int n) {
		if (n == 0) {
			return arr[n];
		}

		return arr[n] + sumOfArray(n-1);
	}

	public static void main(String[] args) {
		SumOfArray sa= new SumOfArray();
		System.out.println(sa.sumOfArray(sa.arr.length-1));
	}
}
