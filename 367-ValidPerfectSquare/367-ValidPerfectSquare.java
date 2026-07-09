// Last updated: 09/07/2026, 09:18:03
class Solution {
    public boolean isPerfectSquare(int num) {
        
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }

        return false;
    }
}