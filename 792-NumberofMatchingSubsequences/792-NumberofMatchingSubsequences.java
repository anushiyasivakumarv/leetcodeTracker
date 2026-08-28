// Last updated: 8/28/2026, 2:24:54 PM
1class Solution {
2    public String reorderSpaces(String text) {
3        int totalSpaces = 0;
4        for (char c : text.toCharArray()) {
5            if (c == ' ') totalSpaces++;
6        }
7        String[] words = text.trim().split("\\s+");
8        int wordCount = words.length;
9        int spacesBetween = 0;
10        int extraSpaces = 0;
11        if (wordCount > 1) {
12            spacesBetween = totalSpaces / (wordCount - 1);
13            extraSpaces = totalSpaces % (wordCount - 1);
14        } else {
15            extraSpaces = totalSpaces;
16        }
17        StringBuilder result = new StringBuilder();
18        for (int i = 0; i < wordCount; i++) {
19            result.append(words[i]);
20            if (i < wordCount - 1) {
21                result.append(" ".repeat(spacesBetween));
22            }
23        }
24        result.append(" ".repeat(extraSpaces));
25
26        return result.toString();
27    }
28}