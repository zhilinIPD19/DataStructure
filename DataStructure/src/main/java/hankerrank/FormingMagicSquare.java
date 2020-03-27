package hankerrank;

import java.util.Arrays;

public class FormingMagicSquare {

	    /*
	     * 
	     * s: a  array of integers
	     * return an integer that represents the minimal total cost of converting the input square to a magic square.
	     * */
	    static int formingMagicSquare(int[][] s) {
	    	//create an array to contain all the results
	        int[] diffSum = new int[8];
	        //all the possible magic squares 
	        int[][][] proMagicSquares = new int[][][]{
	            {{8,1,6}, {3,5,7}, {4,9,2}},
	            {{6,1,8}, {7,5,3}, {2,9,4}},
	            {{8,3,4}, {1,5,9}, {6,7,2}},
	            {{4,3,8}, {9,5,1}, {2,7,6}},
	            {{6,7,2}, {1,5,9}, {8,3,4}},
	            {{2,7,6}, {9,5,1}, {4,3,8}},
	            {{4,9,2}, {3,5,7}, {8,1,6}},
	            {{2,9,4}, {7,5,3}, {6,1,8}},
	        };
	        
	        for(int i = 0; i < 8; i++) {
	            for(int j = 0; j < 3; j++) {
	                for(int k = 0; k < 3; k++) {
	                    if(s[j][k] != proMagicSquares[i][j][k]) {
	                    	diffSum[i] += Math.abs(s[j][k] - proMagicSquares[i][j][k]);
	                    }
	                }
	            }
	        }
	        //sort the array by ASC
	        Arrays.sort(diffSum);
	        //return the smallest sum
	        return diffSum[0];
	    }


}
