// Last updated: 8/31/2026, 2:51:58 PM
1class Solution {
2        public boolean isMonotonic(int[] A) {
3        boolean inc = true, dec = true;
4        for (int i = 1; i < A.length; ++i) {
5            inc &= A[i - 1] <= A[i];
6            dec &= A[i - 1] >= A[i];
7        }
8        return inc || dec;
9    }
10}