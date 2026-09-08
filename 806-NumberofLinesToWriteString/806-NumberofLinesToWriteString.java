// Last updated: 9/8/2026, 4:10:41 PM
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        char c[]=s.toCharArray();
4        int sum=0,l=0,px=0;
5        int res[]=new int [2];
6        for(char k:c){
7            int r=k-'a';
8            if(sum+widths[r]>100){
9                sum=0;
10                l++;
11            }
12            sum+=widths[r];
13        }
14        if(sum!=0) res[0]=l+1;
15        else res[0]=l;
16        res[1]=sum;
17        return res;
18    }
19}