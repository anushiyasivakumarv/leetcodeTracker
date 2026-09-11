// Last updated: 9/11/2026, 9:24:58 AM
1class Solution {
2    public int expand(String s, int left, int right) {
3        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
4            left--;
5            right++;
6        }
7        return right - left - 1;
8    }
9    public String longestPalindrome(String s) {
10        if (s == null || s.length() < 1) return "";
11        int start = 0, end = 0;
12        
13        for (int i = 0; i < s.length(); i++) {
14            int len1 = expand(s, i, i);
15            int len2 = expand(s, i, i + 1);
16            int len = Math.max(len1, len2);
17            if (len > end - start) {
18                start = i - (len - 1) / 2;
19                end = i + len / 2;
20            }
21        }
22        return s.substring(start, end + 1);
23    }
24}