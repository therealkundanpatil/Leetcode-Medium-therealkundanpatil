package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Medium
 * 
 * Id : 468 Validate IP Address
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class ValidIPAddress {
	public String validIPAddress(String IP) {
		IP = IP.trim();
		String[] ipData = IP.split("[.,:]");

		if (ipData.length == 4) {
			if (!countPeriodOperators(IP, 3)) {
				return "Neither";
			}
			if (checkValididtyForIPV4(ipData)) {
				return "IPv4";
			}
		} else if (ipData.length == 8) {
			Set<Character> set = new HashSet<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
					'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F'));
			if (!countSemiColonOperators(IP, 7)) {
				return "Neither";
			}
			if (checkValididtyForIPV6(ipData, set)) {
				return "IPv6";
			}
		}

		return "Neither";
	}

	public static boolean checkValididtyForIPV4(String[] ipData) {
		for (String record : ipData) {
			try {
				if (record.length() > 1 && record.charAt(0) == '0') {
					return false;
				}
				int number = Integer.parseInt(record);
				if (number < 0 || number > 255) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkValididtyForIPV6(String[] ipData, Set<Character> set) {
		for (String record : ipData) {
			if (record.length() == 0) {
				return false;
			}
			if (record.length() < 1 || record.length() > 4) {
				return false;
			}
			for (char ch : record.toCharArray()) {
				if (!set.contains(ch)) {
					return false;
				}
			}

		}

		return true;
	}

	public static boolean countPeriodOperators(String IP, int desiredCount) {
		int count = 0;
		for (int i = 0; i < IP.length(); i++) {
			if (IP.charAt(i) == '.') {
				count++;
			}
		}

		if (desiredCount == count) {
			return true;
		}
		return false;
	}

	public static boolean countSemiColonOperators(String IP, int desiredCount) {
		int count = 0;
		for (int i = 0; i < IP.length(); i++) {
			if (IP.charAt(i) == ':') {
				count++;
			}
		}

		if (desiredCount == count) {
			return true;
		}
		return false;
	}
}
