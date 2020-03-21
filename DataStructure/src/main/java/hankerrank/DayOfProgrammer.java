package hankerrank;

public class DayOfProgrammer {
	/*
	 * 
	 * Complete the dayOfProgrammer function in the editor below.
	 *  It should return a string representing the date of the  
	 *  day of the year given.		
	 * 
	 * year: an integer
	 * */
    static String dayOfProgrammer(int year) {
    	if(year < 1918) {
    		
    		if(year%4 == 0) 
    			return "12.09."+ year;
    		else 
    			return "13.09."+ year;
    		
    	} else if(year > 1918) {
    		
    		if(year%4 == 0&&year%100 != 0||year%400 == 0) 
    			
    			return "12.09."+ year;
    		else 
    			return "13.09."+ year;
    	} else {
    		
    		return "26.09."+ year;
    	}

    }
}
