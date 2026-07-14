// Last updated: 7/14/2026, 3:55:18 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        StringBuilder sb1 = new StringBuilder();
4        StringBuilder sb2 = new StringBuilder();
5        int m = s.length();
6        int n = t.length();
7        for(int i=0;i<m;i++)
8            {
9                char ch = s.charAt(i);
10                if(ch!='#') sb1.append(ch);
11                else
12                {
13                    if(sb1.length()!=0)
14                    sb1.deleteCharAt(sb1.length()-1);
15                }
16            }
17        for(int i=0;i<n;i++)
18            {
19                char ch = t.charAt(i);
20                if(ch!='#') sb2.append(ch);
21                else
22                {
23                    if(sb2.length()!=0)
24                    sb2.deleteCharAt(sb2.length()-1);
25                }
26            }
27        return sb1.toString().equals(sb2.toString());
28    }
29}