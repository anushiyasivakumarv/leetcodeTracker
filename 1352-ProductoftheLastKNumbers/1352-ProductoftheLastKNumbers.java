// Last updated: 9/9/2026, 3:11:49 PM
1import java.time.LocalDate;
2import java.time.temporal.ChronoUnit;
3
4class Solution {
5    public int daysBetweenDates(String date1, String date2) {
6        LocalDate d1 = LocalDate.parse(date1);
7        LocalDate d2 = LocalDate.parse(date2);
8        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
9    }
10}