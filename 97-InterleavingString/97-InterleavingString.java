// Last updated: 9/28/2026, 2:24:38 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        int n = s1.length();
5        int m = s2.length();
6        if (n + m != s3.length()) {
7            return false;
8        }
9        boolean[] dp = new boolean[m + 1];
10        dp[0] = true;
11        for (int j = 1; j <= m; j++) {
12            dp[j] = dp[j - 1] &&
13                    s2.charAt(j - 1) == s3.charAt(j - 1);
14        }
15        for (int i = 1; i <= n; i++) {
16            dp[0] = dp[0] &&
17                    s1.charAt(i - 1) == s3.charAt(i - 1);
18            for (int j = 1; j <= m; j++) {
19                char c = s3.charAt(i + j - 1);
20                boolean fromS1 = dp[j] &&
21                        s1.charAt(i - 1) == c;
22                boolean fromS2 = dp[j - 1] &&
23                        s2.charAt(j - 1) == c;
24
25                dp[j] = fromS1 || fromS2;
26            }
27        }
28
29        return dp[m];
30    }
31}