package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Record class consist of triplets
 * Implemented equals and hashCode method for object comparison
 * 
 * @author Kundan
 *
 */
class Record {
	int firstNumber = 0;
	int secondNumber = 0;
	int thirdNumber = 0;

	Record(int firstNumber, int secondNumber, int thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public boolean equals(Object anotherRecord) {
		if (this == anotherRecord) {
			return true;
		}
		Record record = (Record) anotherRecord;
		// Check if all three fields are same
		if (this.firstNumber == record.firstNumber && this.secondNumber == record.secondNumber
				&& this.thirdNumber == record.thirdNumber) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		// unique value for each set of combination... multiply by prime numbers
		int hashValue = (this.firstNumber * 31 + this.secondNumber * 23 + this.thirdNumber * 17) % 1000000007;
		return hashValue;
	}
}

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> myListToReturn = new ArrayList<>();
		// Set to store unique records 
		Set<Record> set = new HashSet<>();

		for (int i = 0; i < nums.length - 2; i++) {
			int startIndex = i + 1;
			int endIndex = nums.length - 1;
			int target = 0 - nums[i];

			while (startIndex < endIndex) {
				if (nums[startIndex] + nums[endIndex] == target) {
					//Target found.. If unique triplet then add otherwise move forward
					Record recordObject = new Record(nums[i], nums[startIndex], nums[endIndex]);
					if (!set.contains(recordObject)) {
						set.add(recordObject);
						myListToReturn.add(Arrays.asList(nums[i], nums[startIndex], nums[endIndex]));
					}
                    startIndex++;
				    endIndex--;
				} else if ((nums[startIndex] + nums[endIndex]) > target) {
					endIndex--;
				} else {
					startIndex++;
				}
			}
		}

		return myListToReturn;
	}
}
