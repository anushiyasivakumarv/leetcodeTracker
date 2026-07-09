// Last updated: 09/07/2026, 09:17:48
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0, max=0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(max, count);
            }
            else count=0;
        }
        return max;
    }
}