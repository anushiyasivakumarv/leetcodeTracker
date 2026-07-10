// Last updated: 10/07/2026, 15:59:41
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] ugly = new int[n];
4        ugly[0] = 1;
5        int two = 0;
6        int three = 0;
7        int five = 0;
8        for(int i = 1; i < n; i++) {
9            int nextTwo = ugly[two] * 2;
10            int nextThree = ugly[three] * 3;
11            int nextFive = ugly[five] * 5;
12            int next = Math.min(nextTwo,
13                        Math.min(nextThree, nextFive));
14            ugly[i] = next;
15            if(next == nextTwo) {
16                two++;
17            }
18            if(next == nextThree) {
19                three++;
20            }
21            if(next == nextFive) {
22                five++;
23            }
24        }
25        return ugly[n-1];
26    }
27}