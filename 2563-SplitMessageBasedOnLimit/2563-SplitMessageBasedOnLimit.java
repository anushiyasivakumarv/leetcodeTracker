// Last updated: 09/07/2026, 09:16:39
class Solution {
    public String[] splitMessage(String message, int limit) {
        int size = message.length();
        int lenOfIndice = 1, total = 1;
        while (size + (3 + len(total)) * total + lenOfIndice > limit * total) {
            if (3 + len(total) * 2 >= limit) return new String[0];
            total += 1;
            lenOfIndice += len(total);
        }
            
        return formStrings(message, limit, total);
    }
    private String[] formStrings(String message, int limit, int total) {
        int index = 0;
        String[] result = new String[total];
        for (int i = 1; i <= total; ++i) {
            String suffix = String.format("<%d/%d>", i, total);
            // do not exceed the length of the "message" using Math.min()
            String prefix = message.substring(index, Math.min(index + limit - suffix.length(), message.length()));
            result[i - 1] = prefix + suffix;
            index += limit - suffix.length();
        }
        return result;
    }
    private int len(int number) {
        return String.valueOf(number).length();
    }

}