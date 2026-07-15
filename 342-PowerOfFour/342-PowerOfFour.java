// Last updated: 15/07/2026, 11:54:43
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}