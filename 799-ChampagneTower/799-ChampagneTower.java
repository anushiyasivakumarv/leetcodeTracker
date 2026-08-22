// Last updated: 8/22/2026, 5:55:22 PM
1class Solution {
2    public String breakPalindrome(String palindrome) {
3        if(palindrome.length() == 0 || palindrome.length() == 1){
4            return "";
5        }
6        char[] ch = palindrome.toCharArray();
7        for(int i = 0;i<ch.length/2;i++){
8            if(ch[i]-'a' != 0){
9                ch[i] = 'a';
10                return new String(ch);
11            }
12            
13        }
14        ch[ch.length-1] = 'b';
15        return new String(ch);
16    }
17}