package multipleArrays;

public class Main {

	public static void main(String[] args) {

		ReplaceElement replaceElement = new ReplaceElement();

		String[][] arr = { { "red", "purple", "yellow" }, { "red", "yellow" }, { "blue", "purple", "yellow" } };

		String[][] newArr = replaceElement.replaceElement(arr, "purple", "yellow");
		int rows = arr.length;
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(newArr[i][k] + " ");
			}
		}
		System.out.println();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		CheckStudentAnswers checkStudentAnswers = new CheckStudentAnswers();

		char[][] answers = { { 'a', 'b', 'c', 'd', 'e' }, { 'a', 'c', 'c', 'd', 'e' }, { 'a', 'c', 'c', 'a', 'e' },
				{ 'c', 'b', 'c', 'd', 'e' }, { 'a', 'a', 'c', 'd', 'e' } };

		char[] keys = { 'a', 'b', 'c', 'd', 'e' };

		int[] correctAnswers = checkStudentAnswers.checkStudentAnswers(answers, keys);

		for (int i = 0; i < correctAnswers.length; i++) {

			System.out.print(correctAnswers[i] + " ");
		}

	}
}
