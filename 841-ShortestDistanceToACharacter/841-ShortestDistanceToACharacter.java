// Last updated: 09/07/2026, 09:17:22
class Solution {
    public int[] shortestToChar(String s, char c) {
        char [] chars = s.toCharArray(); 
        int[] distance = new int[chars.length];

        int lastIndex = 1_000_000;

        for (int i = 0; i < distance.length; i++) {
            if (chars[i] == c) {
                lastIndex = i;
                continue;
            }

            distance[i] = Math.abs(i - lastIndex);
        }

        for (int i = distance.length - 1; i >= 0; i--) {
            if (chars[i] == c) {
                lastIndex = i;
                continue;
            }

            if (Math.abs(i - lastIndex) < distance[i]) {
                distance[i] = Math.abs(i - lastIndex);
            }
        }

        return distance;
    }
}