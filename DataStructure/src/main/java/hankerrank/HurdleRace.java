package hankerrank;


public class HurdleRace {
	  // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
    	
    	int highest = k;
    	for (int i = 0; i < height.length; i++) {
			if(height[i]>highest) {
				highest = height[i];
			}
		}
    	return highest-k; 
    }
}
