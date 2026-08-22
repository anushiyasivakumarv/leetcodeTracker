// Last updated: 8/22/2026, 4:20:03 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] fr = new int[26];
4
5        for (char ch : text.toCharArray()) {
6            fr[ch - 'a']++;
7        }
8
9        String balloon = "balloon";
10        int count = 0;
11
12        while (true) {
13            
14            for (char ch : balloon.toCharArray()) {
15                if (fr[ch - 'a'] == 0) {
16                    return count;
17                }
18                fr[ch - 'a']--;
19            }
20            count++;
21        }
22    }
23}