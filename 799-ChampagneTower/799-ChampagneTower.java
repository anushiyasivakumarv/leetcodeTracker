// Last updated: 8/22/2026, 4:10:47 PM
1class Solution {
2    public List<Integer> addToArrayForm(int[] num, int k) {
3        List<Integer> result=new ArrayList<>();
4        int n=num.length;
5
6        for(int i=n-1;i>=0;i--){
7            k+=num[i];
8            result.add(k%10); 
9            k/=10; 
10        }
11        while(k>0){
12            result.add(k%10);
13            k/=10;
14        }
15        Collections.reverse(result);
16        return result;
17    }
18}