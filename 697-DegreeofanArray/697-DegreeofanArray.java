// Last updated: 03/08/2026, 17:08:48
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        int max=0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        ArrayList<Integer> list = new ArrayList<>();
6        for(int i: nums){
7            list.add(i);
8            map.put(i,map.getOrDefault(i,0)+1);
9            if((int)map.get(i)>max)
10                max=map.get(i);
11        }
12        int min = Integer.MAX_VALUE;
13        for(Map.Entry m: map.entrySet()){
14            if((int)m.getValue()==max){
15                int num = (int)m.getKey();
16                int n1 = list.indexOf(num);
17                int n2 = list.lastIndexOf(num);
18                if(n2-n1+1<min)
19                    min=n2-n1+1;
20            }
21        }
22        return min;
23    }
24}