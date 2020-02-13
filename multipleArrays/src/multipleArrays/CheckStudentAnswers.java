package multipleArrays;

public class CheckStudentAnswers {
	
	public int[] checkStudentAnswers(char[][] answers, char[] keys) {
		
		int[] corrects = new int[answers.length];
		for(int i = 0; i < answers.length; i++) {
			int correct = 0;
			for(int k = 0; k < answers[i].length; k++) {
				if(answers[i][k] == keys[k]) {
				correct +=1;
				}
				corrects[i]= correct;
			}
		}		
		return corrects;
	}

}
