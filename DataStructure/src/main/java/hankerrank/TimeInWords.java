package hankerrank;

public class TimeInWords {
	 static String timeInWords(int h, int m) {
		 String[] hours = {"one","two","three","four","five","six","seven",
				 "eight","nine","ten","eleven","twelve"};
		 String[] minutes = {"one","two","three","four","five","six","seven",
				 "eight","nine","ten","eleven","twelve","thirteen","fourteen",
				 "fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one",
				 "twenty two","twenty three","twenty four","twenty five","twenty six",
				 "twenty seven","twenty eight","twenty nine"};
		if(m == 0) {
			return hours[h-1] + " o' clock";
		}
		else if(m == 30) {
			return "half past " + hours[h-1];
		}
		else if(m==15) {
			return "quarter past " + hours[h-1];
		}
		else if(m==45) {
			return "quarter to " + hours[h];
		}
		else if(m < 30) {
			
			return  minutes[m-1] + ((m==1)? " minute":" minutes") + " past " + hours[h-1];
		}
		else {
			return minutes[60-m-1] + ((m==59)? " minute":" minutes")+" to " + hours[h];
		}
		
	}
	 public static void main(String[] args) {
		
	
	 System.out.println(timeInWords(5,59));
	
}
	 }
