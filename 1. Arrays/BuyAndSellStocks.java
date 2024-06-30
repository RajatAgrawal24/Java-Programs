public class BuyAndSellStocks {
    public static int maxProfit(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++) {
            if(buyPrice > arr[i]){
                buyPrice = arr[i];
            }else{
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit , maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + maxProfit(arr));
    }
}
