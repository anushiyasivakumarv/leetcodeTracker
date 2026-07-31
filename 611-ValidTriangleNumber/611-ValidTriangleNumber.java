// Last updated: 7/31/2026, 2:36:17 PM
class Solution {
    public int triangleNumber(int[] nums) {
      Arrays.sort(nums); 
        int n = nums.length;
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;  
    }
}