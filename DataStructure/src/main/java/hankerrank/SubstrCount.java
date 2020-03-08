package hankerrank;



public class SubstrCount {
	
	    
	 static long substrCount(int n, String s) {		 
			long count = n;
	    	for (int i = 0; i < n; i++) {
	    		// if the current symbol is in the middle like 'aba'
	    		int offset = 1;
	    		while (i - offset >= 0 && i + offset < n && s.charAt(i - offset) == s.charAt(i - 1)
	    				&& s.charAt(i + offset) == s.charAt(i - 1)) {
	    			count++;
	    			offset++;
	    		}
	    		// if this is repeatable characters like 'aa'
	    		int repeats = 0;
	    		while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
	    			repeats++;
	    			i++;
	    		}
	    		count += repeats * (repeats + 1) / 2;
	    	}
	    	
	    	return count;	    
	    }
	 public static void main(String[] args) {
		int n = 7;
		String s = "abcbaba";
		System.out.println(substrCount(n, s));
	 }

}
