package medium;

import java.util.List;

/**
 * LeetCode Medium
 * 
 * Id: 1428		Left most Column with at least a one 
 * 
 * Time Complexity : O( n + log(n) );
 * 
 * Space Complexity: O(1);
 * @author Kundan
 *
 */

public class LeftMostColumnWithAtLeastAOne {
	public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
		List<Integer> dimensionList = binaryMatrix.dimensions();

		int minimumIndex = Integer.MAX_VALUE;
		int rowLimit = dimensionList.get(0);
		int columnLimit = dimensionList.get(1);

		//Scan each row of the matrix
		for (int row = 0; row < rowLimit; row++) {
			//Since columns are sorted, binary search can applied on the columns to minimize calls to interface 
			int leftColumn = 0;
			int rightColumn = columnLimit - 1;
			int oneIndex = -1;
			while (leftColumn < rightColumn) {
				int middleColumn = leftColumn + (rightColumn - leftColumn) / 2;
				int value = binaryMatrix.get(row, middleColumn);
				if (value == 0) {
					leftColumn = middleColumn + 1;
				} else {
					rightColumn = middleColumn;
				}
			}

			oneIndex = binaryMatrix.get(row, leftColumn) == 0 ? Integer.MAX_VALUE : leftColumn;

			if (minimumIndex >= oneIndex) {
				minimumIndex = oneIndex;
			}

		}

		if (minimumIndex == Integer.MAX_VALUE) {
			return -1;
		}
		return minimumIndex;

	}
}
