// Last updated: 9/2/2026, 9:10:56 AM
class Solution {
    public int removePalindromeSub(String s) {
        if(check(s))
        {
            return 1;
        }
        return 2;
    }
    static boolean check(String s)
    {
        int i = 0; int j= s.length()-1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }
}