// Last updated: 9/2/2026, 9:10:35 AM
class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpaces++;
        }
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        int spacesBetween = 0;
        int extraSpaces = 0;
        if (wordCount > 1) {
            spacesBetween = totalSpaces / (wordCount - 1);
            extraSpaces = totalSpaces % (wordCount - 1);
        } else {
            extraSpaces = totalSpaces;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            result.append(words[i]);
            if (i < wordCount - 1) {
                result.append(" ".repeat(spacesBetween));
            }
        }
        result.append(" ".repeat(extraSpaces));

        return result.toString();
    }
}