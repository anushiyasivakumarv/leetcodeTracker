// Last updated: 09/07/2026, 09:16:35
class Solution {
    public int minimumPushes(String word) {
        int[] chars = new int[26];

        for(char c : word.toCharArray()) chars[c - 97]++;

        Arrays.sort(chars);
        int count = 0, total = 0, i = 25;

        while(i >= 0) {
            total += chars[i--] * ((count / 8) + 1);
            count++;
        }

        return total;
    }
}