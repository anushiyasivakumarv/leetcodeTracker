// Last updated: 8/22/2026, 4:27:11 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] fr = new int[26];

        for (char ch : text.toCharArray()) {
            fr[ch - 'a']++;
        }

        String balloon = "balloon";
        int count = 0;

        while (true) {
            
            for (char ch : balloon.toCharArray()) {
                if (fr[ch - 'a'] == 0) {
                    return count;
                }
                fr[ch - 'a']--;
            }
            count++;
        }
    }
}