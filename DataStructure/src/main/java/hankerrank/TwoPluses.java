package hankerrank;

import java.util.Arrays;

public class TwoPluses {
	  static int twoPluses(String[] grid) {
		  int result=1;	
		  
		  
		  for (int i = 1; i < grid.length-1; i++) {
			  int k = 0;
			  int l = 1;
			
			 
			  for(int j = 1; j < grid[i].length()-1;j++) {
				  char c = grid[i].charAt(j);
				  while(j-k>=0 && j+k < grid[i].length()-1){
					  if(grid[i].charAt(j-k) != c||grid[i].charAt(j+k)!= c )
						  break;
					  k++;					  
				  }
				  
				  while(i-l>=0 && i+l < grid.length-1 && l <= k-1) {
					  if(grid[i-l].charAt(j)== c&&grid[i+l].charAt(j)== c) 
					  {
						 grid[i]=grid[i].substring(0,j)+'x'+grid[i].substring(j+1);
						 grid[i]=grid[i].substring(0,j-l)+'x'+grid[i].substring(j-l+1);
						 grid[i]=grid[i].substring(0,j+l)+'x'+grid[i].substring(j+l+1);
						 grid[i-l] = grid[i-l].substring(0,j)+'x'+grid[i-l].substring(j+1);
						 grid[i+l] = grid[i+l].substring(0,j)+'x'+grid[i+l].substring(j+1);
					  }else 
						  break;
					  
					  l++;									  
				  }		
				  
			  }	
			  Arrays.stream(grid).forEach(n -> System.out.println(n));
			  System.out.println();
			  result *= (l-1)*4+1;			  
		  }
		  return result;
		 
	  }
	  public static void main(String[] args) {
		  String[] s1= {"GGGGGGGG","GBGBGGBG","GBGBGGBG","GGGGGGGG","GBGBGGBG","GGGGGGGG","GBGBGGBG","GGGGGGGG"};
		  System.out.println(twoPluses(s1));
		
		  
		
	}
}
