package medium;

/**
 * LeetCode Medium
 * 
 * Id:  Clumsy Factorial
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * @author Kundan
 *
 */
public class ClumsyFactorial {
	public int clumsyFact(int N) {
		if (N <= 2)
			return N;
		else if (N == 3)
			return (N * (N - 1)) / (N - 2);
		else
			return (N * (N - 1)) / (N - 2) - (N - 3) + clumsyFact(N - 4);
	}

	public int clumsy(int N) {
		if (N <= 3)
			return clumsyFact(N);
		else
			return ((N * (N - 1)) / (N - 2) + (N - 3)) - clumsyFact(N - 4);
	}
}
