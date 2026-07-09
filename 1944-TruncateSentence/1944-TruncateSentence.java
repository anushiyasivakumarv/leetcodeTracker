// Last updated: 09/07/2026, 09:16:40
class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        String[] j=s.split(" ");
        for(int i=0;i<k-1;i++){
            ans=ans+j[i]+" ";
        }
        ans=ans+j[k-1];
        return ans;
    }
}