// Last updated: 7/13/2026, 3:52:32 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        StringBuilder sb = new StringBuilder();
4
5        for (int i = 0; i < num.length(); i++) {
6            char ch = num.charAt(i);
7
8            while (sb.length() > 0 && k > 0 &&
9                   sb.charAt(sb.length() - 1) > ch) {
10                sb.deleteCharAt(sb.length() - 1);
11                k--;
12            }
13
14            sb.append(ch);
15        }
16
17        while (k > 0) {
18            sb.deleteCharAt(sb.length() - 1);
19            k--;
20        }
21
22        while (sb.length() > 1 && sb.charAt(0) == '0') {
23            sb.deleteCharAt(0);
24        }
25
26        if (sb.length() == 0) {
27            return "0";
28        }
29
30        return sb.toString();
31    }
32}