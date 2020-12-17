package medium;

/**
 * LeetCode Medium
 * 
 * Id  : 319  Bulb Switcher
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class BulbSwitcher {
	public int bulbSwitch(int n) {
		int counter = 0;
		for (int i = 1; i * i <= n; i++) {
			counter++;
		}
		return counter;
	}
}
