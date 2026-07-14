// Last updated: 7/14/2026, 3:09:12 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if (n <= 0)
4            return false;
5
6        while (n % 4 == 0) {
7            n /= 4;
8        }
9
10        return n == 1;
11    }
12}