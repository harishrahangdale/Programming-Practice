package leetcode;

/**
 * Given a string s, find the length of the longest substring without duplicate
 * characters.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * 
 * Output: 3
 * 
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * 
 * Output: 1
 * 
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * 
 * Output: 3
 * 
 * Explanation: The answer is "wke", with the length of 3.
 * 
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 */

public class LongestSubStringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
		String maxLongest = "";
		for (int i = 0; i < s.length(); i++) {
			String currentLongest = "";
			for (int j = i; j < s.length(); j++) {
				if (!currentLongest.contains(String.valueOf(s.charAt(j)))) {
					currentLongest += s.charAt(j);
				} else {
					break;
				}
			}
			if (currentLongest.length() > maxLongest.length()) {
				maxLongest = currentLongest;
			}
		}
		return maxLongest.length();
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}
}