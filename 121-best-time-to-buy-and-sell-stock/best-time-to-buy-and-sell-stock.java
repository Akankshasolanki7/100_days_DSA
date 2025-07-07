class Solution {
    public int maxProfit(int[] prices) {
        // int willbuy=prices[0];
        // int profit=0;
        // for( int i=1;i<prices.length;i++){
        //     if(prices[i] < willbuy){
        //         willbuy=prices[i];
        //     }
        //     else{
        //         int current_profit=prices[i]-buy_price;
        //         profit=Math.max(current_profit,profit);
        //     }
        // }
        // return profit;



          int profit=0;
          int buy=prices[0];
          for(int i:prices){
               if(buy >i){
                buy=i;
               }
               else {
                profit=Math.max(i-buy,profit);
               }
          }
          return profit;
    }
}















    