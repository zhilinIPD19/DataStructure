package hankerrank;

public class BeautifulDays {
	 static int beautifulDays(int i, int j, int k) {
		 int count = 0;
		 for(int n = i; n <= j; n++) {
			 if(Math.abs(n-reverseInt(n))%k==0) {
				 count++;
			 }
	    }
		 return count;
	 }
	 static int reverseInt(int num) {
		 int reverseNum = 0;
		 while(num >= 1) {
			 reverseNum = reverseNum*10 + num%10;
			 num /= 10;
		 }
		 return reverseNum;
	 }
	 public static void main(String[] args) {
		System.out.println(reverseInt(122));
		System.out.println(beautifulDays(24,12,4));
	}
}
