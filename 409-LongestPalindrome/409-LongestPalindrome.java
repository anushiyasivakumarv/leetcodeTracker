// Last updated: 09/07/2026, 09:17:57
class Solution {

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        int length = 0;
        boolean oddFound = false;
        for (int num : count) {
            if (num % 2 == 0) {
                length += num;
            } else {
                length += num - 1;
                oddFound = true;
            }
        }
        if (oddFound) {
            length++;
        }
        return length;
    }
}