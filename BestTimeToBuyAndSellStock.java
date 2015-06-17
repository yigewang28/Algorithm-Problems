public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
            int tempProfit = 0;
            if(prices[i] > min) {
                tempProfit = prices[i] - min;
                max = Math.max(max, tempProfit);
            }
            else {
                min = prices[i];
            }
        }
        return max;
    }
}