// Last updated: 15/07/2026, 11:54:13
class Solution {
    public int[] getNoZeroIntegers(int n) {

        int a = 1;
        int b = n - 1;

        while (true) {
            if (valid(a) && valid(b)) {
                return new int[]{a, b};
            }
            a++;
            b--;
        }
    }

    public boolean valid(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}