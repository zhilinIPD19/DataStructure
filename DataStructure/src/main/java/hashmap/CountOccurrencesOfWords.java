package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfWords {
	
	public static void countOccurrencesOfWords(String str) {
		
		String[] words = str.split(" ");
		
		Map<String,Integer> uniqueWords = new HashMap<String,Integer>();
		
		for (int i = 0; i < words.length; i++) {	
			
			if(!uniqueWords.containsValue(words[i])) {
				
					uniqueWords.put(words[i],1);}
			
			else uniqueWords.put(words[i],(uniqueWords.get(words[i])+1));
		}
		
		uniqueWords.forEach((keeeey,vaaaalue) -> System.out.println("Key = "

                + keeeey + ", Value = " + vaaaalue)); 
		

	}
	
	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		countOccurrencesOfWords(str);
	
}
}
