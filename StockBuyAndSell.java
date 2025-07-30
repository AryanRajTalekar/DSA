
public class StockBuyAndSell {
     public static void main(String [] args){
        int arr[] = {7, 10, 1, 3, 6, 9, 2 };
        System.out.println(transaction(arr));
    }

    // public static int transaction(int[] arr){
    //     int maxProfit = Integer.MIN_VALUE;
    //     int profit = -1;

    //         for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
    //         }
    //     }
    

    //     return maxProfit;
    // }

     public static int transaction(int[] arr){
        int minSOFar = arr[0];
        int profit = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                minSOFar = Math.min(minSOFar,arr[i]);

                profit = Math.max(profit,arr[i]-minSOFar);
        }
    

        return profit;
    }

}
