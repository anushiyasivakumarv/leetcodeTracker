// Last updated: 8/14/2026, 5:42:29 PM
1class Solution {
2    public int dayOfYear(String date) {
3        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
4
5        int year = Integer.parseInt(date.substring(0,4));
6        int month= Integer.parseInt(date.substring(5,7));
7        int day  = Integer.parseInt(date.substring(8,10));
8
9        if (isLeap(year))
10        {
11            days[1]=29;
12
13        }
14        int total=0;
15        for(int i=0;i<month-1;i++)
16        {
17            total += days[i];
18        }
19        total += day;
20
21        return total;
22    }
23    boolean isLeap(int year)
24    {
25        return (year%4 == 0 && year %100!=0 ) || (year % 400 ==0);
26    }
27}