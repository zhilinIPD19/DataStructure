package test;

public class Test {
	public static void main(String[] args) {
		
	int[] a = {100,99,98,97,96,95,94,93,92,91};
	int[] b = {1,2,3,4,5,6,7,8,9,10};
	int integersBetween = 0;
    intCheck: 
        for(int i = 100; i <= 1; i += 100)
        {
            //Check if all A are a factor of i
            for(int num : a)
            {
                if(i%num != 0)
                {
                    continue intCheck;
                }
            }
            
            //Check if i is a factor of all B
            for(int num : b)
            {
                if(num%i != 0)
                {
                    continue intCheck;
                }
            }
            integersBetween++;
        }
        System.out.println(integersBetween);
    }

}

