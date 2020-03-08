package hankerrank;

public class BreakingRecords {
	  static int[] breakingRecords(int[] scores) {
		  int[] result = new int[2];
		  int lowRecord = scores[0];
		  int highRecord = scores[0];
		  for (int i = 1; i < scores.length; i++) {
			if(scores[i]<lowRecord) {
				result[0]++;
				lowRecord = scores[i];
			}
			if(scores[i]>highRecord) {
				result[1]++;
				highRecord = scores[i];
			}
		}
		  return result;
	    }
}
