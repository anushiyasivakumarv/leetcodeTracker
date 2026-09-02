// Last updated: 9/2/2026, 4:14:27 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]%2!=0)nums[i]=1;
5            else nums[i]=0;
6        }
7        return helper(nums,k)-helper(nums,k-1);
8    }
9    public static int helper(int[]arr,int target){
10        if(target<0)return 0;
11        int left=0,right=0,ans=0,sum=0;
12        while(right<arr.length){
13            sum+=arr[right];
14            while(sum>target&&left<arr.length){
15                sum-=arr[left++];
16            }
17            ans+=(right-left+1);
18            right++;
19        }
20        return ans;
21    }
22}