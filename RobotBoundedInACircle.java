package medium;

/**
 * LeetCode Medium
 * 
 * Id: Robot Bounded in a circle
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class RobotBoundedInACircle {
	public boolean isRobotBounded(String instructions) {
		char[] instructionsArray = instructions.toCharArray();

		// Initially at origin
		int distanceInXdirection = 0;
		int distanceInYdirection = 0;

		// Facing North
		int angle = 90;

		for (int i = 0; i < instructionsArray.length; i++) {
			if (instructionsArray[i] == 'L') {
				angle += 90;
				angle %= 360;
			} else if (instructionsArray[i] == 'R') {
				angle -= 90;
				angle %= 360;
			} else {
				distanceInXdirection += Math.cos(Math.toRadians(angle));
				distanceInYdirection += Math.sin(Math.toRadians(angle));
			}
		}

		if ((distanceInXdirection == 0 && distanceInYdirection == 0) || (angle != 90)) {
			return true;
		}

		return false;
	}
}
