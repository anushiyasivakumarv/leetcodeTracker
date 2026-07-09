// Last updated: 09/07/2026, 09:16:33
class Solution {
    
    public static boolean check(String copy, String word) {
        
        int m = copy.length(), n = word.length();
        for (int i=0; i<m; i++) {
            if (copy.charAt(i) != word.charAt(i)) return false;
        }
        return true;
    }
    
    public int minimumTimeToInitialState(String word, int k) {
        
        int res = 0;
        String copy = new String(word);
        
        do {
            res++;
            if (copy.length() < k)  return res;
            copy = copy.substring(k);
        }
        while (!check(copy, word));
        
        return res;
        
    }
}