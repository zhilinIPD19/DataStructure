package multipleArrays;

public class CheckStudentAnswers {
	/*
	 * Write a program to find how many correct answer each student had in a multiple choice quiz.
		• Char[][] ={{},{},{}...}
		• char[] keys = {‘a’, ‘c’,’d’}
	 */

	public int[] checkStudentAnswers(char[][] answers, char[] keys) {

		int[] corrects = new int[answers.length];
		for (int i = 0; i < answers.length; i++) {
			int correct = 0;
			for (int k = 0; k < answers[i].length; k++) {
				if (answers[i][k] == keys[k]) {
					correct += 1;
				}
				corrects[i] = correct;
			}
		}
		return corrects;
	}
//teacher's answer
	public Student[] countCorrectAnswers(char[][] answers, char[] key) {

		// count of students
		int[] result = new int[answers.length];

		Student[] studentResults = new Student[answers.length];

		for (int i = 0; i < answers.length; i++) {
			int counter = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == key[j]) {
					counter++;
				}

			}
			result[i] = counter;

			studentResults[i] = new Student();
			studentResults[i].setName("Student number " + (i + 1));
			studentResults[i].setGrade(counter);
		}

		// return result;
		return studentResults;
	}

}
