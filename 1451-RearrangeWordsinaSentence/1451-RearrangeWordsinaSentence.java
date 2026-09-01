// Last updated: 9/1/2026, 2:56:25 PM
1class Solution {
2    public String arrangeWords(String text) {
3        String[] words = text.split(" ");
4        words[0] = words[0].toLowerCase();
5        Arrays.sort(words, Comparator.comparingInt(String::length));
6        words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
7        return String.join(" ", words);
8    }
9}