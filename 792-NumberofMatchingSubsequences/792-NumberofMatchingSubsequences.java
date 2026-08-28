// Last updated: 8/28/2026, 2:32:52 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3       int[] rs = new int[nums.length];
4       rs[0] = nums[0];
5        for (int i = 1; i < nums.length; i++) {
6            rs[i] = rs[i - 1] + nums[i];
7        }
8        return rs;
9    }
10}