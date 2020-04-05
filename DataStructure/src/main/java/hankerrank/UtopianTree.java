package hankerrank;

public class UtopianTree {
	/*
	 * return the integer height of the tree after the input number of growth cycles.
	 * 
	 * n: an integer, the number of growth cycles to simulate
	 * */
	
	static int utopianTree(int n) {
		int height = 1;
		int cycle = 1;
		while(cycle <= n) {
			if(cycle%2 !=0) {
				height *= 2;
			}else 
				height +=1;
			cycle++;
		}
		
		return height;
    }
	public static void main(String[] args) {
		System.out.println(utopianTree(2));
	}
}
