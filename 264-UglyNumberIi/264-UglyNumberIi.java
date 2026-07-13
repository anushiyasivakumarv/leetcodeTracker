// Last updated: 7/13/2026, 2:39:24 PM
class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int two = 0;
        int three = 0;
        int five = 0;
        for(int i = 1; i < n; i++) {
            int nextTwo = ugly[two] * 2;
            int nextThree = ugly[three] * 3;
            int nextFive = ugly[five] * 5;
            int next = Math.min(nextTwo,
                        Math.min(nextThree, nextFive));
            ugly[i] = next;
            if(next == nextTwo) {
                two++;
            }
            if(next == nextThree) {
                three++;
            }
            if(next == nextFive) {
                five++;
            }
        }
        return ugly[n-1];
    }
}