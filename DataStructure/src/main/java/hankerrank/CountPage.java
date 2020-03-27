package hankerrank;

public class CountPage {
	  /*
     * Complete the pageCount function below.
     * 
     * n: the number of pages in the book
     * p: the page number to turn to
     * 
     *  return the minimum number of pages Brie must turn.
     */
    static int pageCount(int n, int p) {
     	
     		return (n%2==0)?Math.min(p/2,(n+1-p)/2): Math.min(p/2,(n-p)/2);
     	
    }

}
