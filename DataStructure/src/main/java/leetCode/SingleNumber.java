package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
    	
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) {
            	map.remove(nums[i]);
            }else 
            	map.put((nums[i]),1);
        }
       return (int) map.keySet().toArray()[0];
       
        
    }
    //main
    public static void main(String[] args) {
		int[] arr = {4,1,2,2,1};
		System.out.println(singleNumber(arr));
	}

    //using recursion
    public boolean isHappyRecuesive(int n) {
        if (n < 10) {
            return n == 1 || n == 7;
        }
        int newsum = 0;
        while (n != 0) {
            int digit = n % 10;
            newsum += digit*digit;
            n /= 10;
        }
        //System.out.println(newsum);
        return isHappyRecuesive(newsum);
    }
	    
}
