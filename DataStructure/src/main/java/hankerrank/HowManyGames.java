package hankerrank;

public class HowManyGames {
	 static int howManyGames(int p, int d, int m, int s) {
	     // Return the number of games you can buy
		 if(s < p)
			 return 0;
		 int count = 0;
		 int times = (p-m)/d;
		 while(count <= times) {
			 s -= p;			
			 p -= d;			
			 count++;
			 if(s < p)
				 return count;
		 }
		return count += s/m;
	    }
	 public static void main(String[] args) {
		System.out.println(howManyGames(100,12,55,95));
	}
}
