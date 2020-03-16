package hankerrank;

public class ChocolateFeast {
	/******
	 * 
	 * Complete the chocolateFeast function in the editor below. It must return the number 
	 * of chocolates Bobby can eat after taking full advantage of the promotion.
	 * @param n an integer representing Bobby's initial amount of money
	 * @param c an integer representing the cost of a chocolate bar
	 * @param m an integer representing the number of wrappers he can turn in for a free bar
	 * @return
	 */
	  static int chocolateFeast(int n, int c, int m) {
		  int count = n / c;
          int left = 0;
          int wrapper = n / c;
          int newWrapper = 0;
          
          while(wrapper >= m) {
             left = wrapper % m;
             newWrapper = wrapper/m;
             wrapper=newWrapper + left;
             count += newWrapper;             
          }
          return count;
        }
	  public static void main(String[] args) {
		System.out.println(chocolateFeast(10,2,5));
	}

}
