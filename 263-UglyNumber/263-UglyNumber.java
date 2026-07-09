// Last updated: 09/07/2026, 09:18:19
class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++)
    while (n % i == 0)
        n /= i;
return n == 1;
    }
}