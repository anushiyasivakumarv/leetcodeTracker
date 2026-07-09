// Last updated: 09/07/2026, 09:18:36
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}