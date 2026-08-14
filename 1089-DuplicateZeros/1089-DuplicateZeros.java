// Last updated: 8/14/2026, 5:38:49 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int length = arr.length;
4
5        for (int i = 0; i < length ; i++)
6        {
7            if (arr[i] == 0 && i+1 < length)
8            {
9                for (int j = length - 1; j > i+1; j--)
10                {
11                    arr[j] = arr[j-1];
12                }
13                arr[i+1] = 0;
14                i++;
15            }
16        }
17    }
18}