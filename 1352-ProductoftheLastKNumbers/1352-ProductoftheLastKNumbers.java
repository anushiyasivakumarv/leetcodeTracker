// Last updated: 9/9/2026, 3:53:43 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max1 = Integer.MIN_VALUE;
5        int max2 = Integer.MIN_VALUE;
6
7        for (int num : nums) {
8
9            if (num > max1) {
10                max2 = max1;
11                max1 = num;
12            } else if (num > max2) {
13                max2 = num;
14            }
15        }
16
17        return (max1 - 1) * (max2 - 1);
18    }
19}