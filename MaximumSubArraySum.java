package medium;

public class MaximumSubArraySum {
	public static int kadanesAlgorithm(int[] array) {
		// Write your code here.
		int maximumSum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			int currentSum = 0;
			for (int j = i; j < array.length; j++) {
				currentSum += array[j];
				if (currentSum > maximumSum) {
					maximumSum = currentSum;
				}
			}

		}
		return maximumSum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(kadanesAlgorithm(array));
	}
}
