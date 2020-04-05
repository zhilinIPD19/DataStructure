package hankerrank;

public class DesignerPdfViewe {
	
	static int designerPdfViewer(int[] h, String word) {
		int highest = 1;
		for (int i = 0; i < word.length(); i++) {
			if(h[word.charAt(i)-'a']>highest) {
				highest = h[word.charAt(i)-'a'];
				
			}			
		}
		return highest*(word.length());


    }

}
