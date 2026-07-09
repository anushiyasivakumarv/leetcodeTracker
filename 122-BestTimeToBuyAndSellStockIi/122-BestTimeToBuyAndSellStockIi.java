// Last updated: 09/07/2026, 09:18:56
class Solution {
    public int maxProfit(int[] prices) {
        int  profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit=profit + (prices[i] - prices[i-1]);
                       }
        }
return profit;
        }
        
    
}
    
