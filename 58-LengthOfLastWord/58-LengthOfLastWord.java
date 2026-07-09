// Last updated: 09/07/2026, 09:19:25
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        // Return last word length
        return count;
    }
}