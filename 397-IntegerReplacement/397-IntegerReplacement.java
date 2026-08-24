// Last updated: 8/24/2026, 5:42:02 PM
1class Solution {
2    public int integerReplacement(int n) {
3    return replace((long)n);
4    }
5    
6    int replace(long n)
7    {
8       int ans=0;
9        if(n<=1)
10        {
11            return 0;
12        }
13        
14        if(n%2==0)
15        {
16            ans=1+replace(n/2);
17        }
18        else
19        {
20            ans=1+Math.min(replace(n+1),replace(n-1));
21        }
22        return ans;
23        
24}
25}