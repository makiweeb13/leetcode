class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int j;
            for (j = i+1; j < prices.length && prices[j] > prices[i]; j++) {}
            if (j < prices.length) prices[i] -= prices[j];
        }
        return prices;
    }
}