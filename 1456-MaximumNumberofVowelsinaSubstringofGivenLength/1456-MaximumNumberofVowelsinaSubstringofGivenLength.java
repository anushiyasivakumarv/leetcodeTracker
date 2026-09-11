// Last updated: 9/11/2026, 2:50:05 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int n = s.length();
4        int maxVowels = 0;
5        int count = 0;
6
7        int[] vowels = new int[128];
8        vowels['a'] = 1;
9        vowels['e'] = 1;
10        vowels['i'] = 1;
11        vowels['o'] = 1;
12        vowels['u'] = 1;
13
14        for (int i = 0; i < k; i++) {
15            count += vowels[s.charAt(i)];
16        }
17
18        maxVowels = count;
19        for (int i = k; i < n; i++) {
20            count += vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
21            maxVowels = Math.max(maxVowels, count);
22            if (maxVowels == k) {
23                return maxVowels; 
24            }
25        }
26        return maxVowels;
27    }
28}