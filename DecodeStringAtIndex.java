package medium;

public class DecodeStringAtIndex {
	public String decodeAtIndex(String S, int K) {
		/*
		 * Compute Size
		 */
		long size = 0;
		for (char ch : S.toCharArray()) {
			if (Character.isDigit(ch)) {
				size *= ch - '0';
			} else {
				size++;
			}
		}

		/*
		 * Search Character
		 */
		for (int i = S.length() - 1; i >= 0; --i) {
			char c = S.charAt(i);
			if (Character.isDigit(c)) {
				size /= c - '0';
				K %= size;
			} else {
				if (K == 0 || K == size) {
					return Character.toString(c);
				}
				size--;
			}

		}

		return "";
	}
}
