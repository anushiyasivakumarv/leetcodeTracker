// Last updated: 16/07/2026, 14:58:26
1import java.util.Arrays;
2
3class Solution {
4    public int findDuplicate(int[] nums) {
5
6        Arrays.sort(nums);
7
8        for (int i = 1; i < nums.length; i++) {
9            if (nums[i] == nums[i - 1]) {
10                return nums[i];
11            }
12        }
13
14        return -1;
15    }
16}