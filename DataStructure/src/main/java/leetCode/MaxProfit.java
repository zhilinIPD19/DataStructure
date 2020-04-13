package leetCode;

public class MaxProfit {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length-1; i++) {
			if(prices[i]>prices[i+1]) {
				continue;
			}
			if(prices[i]<prices[i+1]) {
				for (int j = i; j < prices.length; j++) {
					maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
					
				}
				
			}
		}
		return maxProfit;
        
    }
}
