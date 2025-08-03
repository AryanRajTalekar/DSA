public class StockBuyAndSell_MultipleTransactions {




    public static int maximumProfit(int[] prices){
        int maxProfit = 0;

        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxProfit += prices[i+1]-prices[i];
            }
        }

        return maxProfit;
    }
    

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maximumProfit(prices));
    }
}
