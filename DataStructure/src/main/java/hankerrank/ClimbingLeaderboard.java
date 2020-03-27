package hankerrank;


public class ClimbingLeaderboard {
	/*
	 * return an integer array where each element  represents Alice's rank after the  game.
	 * scores: an array of integers that represent leaderboard scores
	 * alice: an array of integers that represent Alice's scores
	 * */
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int n = alice.length;
		int m = scores.length;
		//give ranks for all the scores
		int[] ranks = new int[m];
		//initiate an array to contain the ranks of Alice
		int[] results = new int[n];
		int rank = 1;
		for (int i = 0; i < m; i++) {
			if(i>0&&scores[i]!=scores[i-1]) {
				rank++;//same records have same rank
			}
			ranks[i] = rank;			
		}
		
		for (int i = 0; i < n; i++) {		
			int start = 0;
			int end = m - 1;;
			
			int result = 1;
			while(end >= start) {
				int middle = (start + end)/2;
				if(alice[i] < scores[middle] ) {
					result = ranks[middle]+1;
					start = middle + 1;
				}else if(scores[middle] == alice[i]) {
					result = ranks[middle];
					break;
				}else end = middle-1;
			}
			results[i] = result;
		}
		return results;
	}

	public static void main(String[] args) {
		int[] a = {100, 100, 50, 40, 40,20 ,10};
		int[] b = {5, 25, 50, 120};
		int[] c = climbingLeaderboard(a, b);
		for (int i : c) {
			System.out.println(i);	
		}
		
				
				
				
	}

}
