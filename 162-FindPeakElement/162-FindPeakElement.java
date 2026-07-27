// Last updated: 27/07/2026, 14:53:38
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=nums[0];
4        int min=nums[0];
5        int result=nums[0];
6        for(int i=1;i<nums.length;i++)
7        {
8            if(nums[i]<0)
9            {
10                int temp=max;
11                max=min;
12                min=temp;
13            }
14            max=Math.max(nums[i],nums[i]*max);
15            min=Math.min(nums[i],nums[i]*min);
16            result=Math.max(result,max);
17        }
18        return result;
19    }
20}