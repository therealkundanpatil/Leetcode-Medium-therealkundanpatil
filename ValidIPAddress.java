package medium;

/**
 * LeetCode Medium
 * 
 * Id : 468 		Validate IP Address
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
			if (!countSemiColonOperators(IP, 7)) {
				return "Neither";
			}
			if (checkValididtyForIPV6(ipData)) {
				return "IPv6";
			}
		}

		return "Neither";
	}

	public static boolean checkValididtyForIPV4(String[] ipData) {
		for (String record : ipData) {
			if (record.length() >= 1 && record.length() <= 3) {
				char[] recordData = record.toCharArray();
				if (record.length() > 1 && recordData[0] == '0') {
					return false;
				}
				for (int i = 0; i < recordData.length; i++) {
					if (recordData[i] >= 48 && recordData[i] <= 57) {
						continue;
					} else {
						System.out.println("Here");
						return false;
					}
				}
				if (Integer.parseInt(record) > 255) {
					System.out.println("Enetered here");
					return false;
				}
			} else {
				return false;
			}

		}
		return true;
	}

	public static boolean checkValididtyForIPV6(String[] ipData) {
		for (String record : ipData) {
			if (record.length() >= 1 && record.length() <= 4) {
				char[] recordData = record.toCharArray();
				for (int i = 0; i < recordData.length; i++) {
					if ((recordData[i] >= 48 && recordData[i] <= 57) || (recordData[i] >= 65 && recordData[i] <= 70)
							|| (recordData[i] >= 97 && recordData[i] <= 102)) {
						continue;
					} else {
						return false;
					}
				}
			} else {
				return false;
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
