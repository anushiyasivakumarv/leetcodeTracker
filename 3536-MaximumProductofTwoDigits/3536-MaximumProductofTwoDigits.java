// Last updated: 8/19/2026, 2:30:41 PM
1class Solution {
2    public int maxProduct(int n) {
3        if(n<=9)return n;
4        int max=0,sMax=0;
5        while(n>0){
6            int currem=n%10;
7            if(currem>max){
8                sMax=max;
9                max=currem;
10            }else if(currem>sMax)sMax=currem;
11            n/=10;
12        }
13        return sMax*max;
14    }
15}
16