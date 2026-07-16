// Last updated: 16/07/2026, 14:36:29
1class Solution {
2    public boolean canPartition(int[] nums) {
3
4        int sum = 0;
5        for (int x : nums) {
6            sum += x;
7        }
8
9        if (sum % 2 != 0) {
10            return false;
11        }
12
13        int target = sum / 2;
14        boolean[] dp = new boolean[target + 1];
15        dp[0] = true;
16
17        for (int x : nums) {
18            for (int j = target; j >= x; j--) {
19                dp[j] = dp[j] || dp[j - x];
20            }
21        }
22
23        return dp[target];
24    }
25}