// Last updated: 09/07/2026, 09:17:28
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch:stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}