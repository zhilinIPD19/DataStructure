package hankerrank;

public class GetMoneySpend {
	/*
     * Complete the getMoneySpent function below.
     * 
     * keyboards: an array of integers representing keyboard prices
     * drives: an array of integers representing drive prices
     * b: the units of currency in Monica's budget
     * 
     *  return the maximum total price for the two items within Monica's budget, or  if she cannot afford both items.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    	int maximumPrice = 0;
        for (int i = 0; i < keyboards.length; i++) {
        	
			for (int j = 0; j < drives.length; j++) {
				int sum = keyboards[i]+drives[j];
				if(sum>maximumPrice&&sum<=b) {
					maximumPrice = sum;
				}
			}
		}
        return maximumPrice==0?-1:maximumPrice;

    }
}
