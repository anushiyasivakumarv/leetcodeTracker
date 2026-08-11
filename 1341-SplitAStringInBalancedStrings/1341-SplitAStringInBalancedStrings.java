// Last updated: 8/11/2026, 1:43:32 PM
class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int sum = 0;
        
        for (char letter : s.toCharArray()) {
            sum += (letter == 'R' ? 1 : -1);
            if (sum == 0) {
                result++;
            }
        }
        
        return result;
    }
}