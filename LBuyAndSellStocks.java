import java.util.*;
public class LBuyAndSellStocks {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<prices.length;i++){
            if(buyPrice < prices[i]){ //profit  and price[i] is todays price
                int profit = prices[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];

            }
            }
            return maxProfit;
        }

        public static void main(String[] args) {
            int prices[]  = {7, 1, 5, 3, 6, 4};
            buyAndSellStocks(prices);
        }

    }
    

