package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * LeetCode Medium
 * 
 * Id: 56				 Merge Intervals
 * 
 * 
 * Time Complexity : O(n* log(n))
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		int i = 0;
		for (int j = 1; j < intervals.length;) {

			if (intervals[i][1] >= intervals[j][0] && intervals[i][1] < intervals[j][1]) {
				intervals[i][1] = intervals[j][1];
				j++;
			} else if (intervals[i][1] < intervals[j][0]) {
				i++;
				intervals[i][0] = intervals[j][0];
				intervals[i][1] = intervals[j][1];
				j++;
			} else
				j++;
		}

		return Arrays.copyOfRange(intervals, 0, i + 1);
	}
}
