// Last updated: 7/31/2026, 2:38:28 PM
1public class Solution {
2    public int[][] matrixReshape(int[][] nums, int r, int c) {
3        int m = nums.length, n = nums[0].length;
4        if (m * n != r * c) return nums;
5        
6        int[][] result = new int[r][c];
7        int row = 0, col = 0;
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                result[row][col] = nums[i][j];
11                col++;
12                if (col == c) {
13                    col = 0;
14                    row++;
15                }
16            }
17        }
18        
19        return result;
20    }
21}