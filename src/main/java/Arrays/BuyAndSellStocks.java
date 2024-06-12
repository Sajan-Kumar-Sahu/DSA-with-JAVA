package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] stockPrice = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit Obtained is =" + findProfit(stockPrice));
    }

    public static int findProfit(int[] price) {
        int buyingPrice = price[0];
        int profit = 0;
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] >= buyingPrice) {
                profit = price[i] - buyingPrice;
            }
            maxProfit = Math.max(maxProfit, profit);
            buyingPrice = Math.min(buyingPrice, price[i]);
        }

        return maxProfit;
    }
}
