// Last updated: 07/08/2026, 16:32:57
1class Solution {
2    public int balancedStringSplit(String s) {
3        int result = 0;
4        int sum = 0;
5        
6        for (char letter : s.toCharArray()) {
7            sum += (letter == 'R' ? 1 : -1);
8            if (sum == 0) {
9                result++;
10            }
11        }
12        
13        return result;
14    }
15}