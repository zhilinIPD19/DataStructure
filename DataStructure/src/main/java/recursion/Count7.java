package recursion;

public class Count7 {
	public static int count7(int digites) {
		
		
		if (digites==0)
			return 0;
		if (digites%10 == 7) {	
	
			return 1 + count7(digites/10);
		}
		else 
		{					
			return 0+ count7(digites/10);}
	}
public static void main(String[] args) {
	System.out.println(count7(717));
}
}
