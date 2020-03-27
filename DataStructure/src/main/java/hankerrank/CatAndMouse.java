package hankerrank;

public class CatAndMouse {
	static String catAndMouse(int x, int y, int z) {
		int differenceOfDistance = Math.abs(x-z)-Math.abs(y-z);
		if(differenceOfDistance > 0) {
			return "Cat B";
		}else if(differenceOfDistance < 0) {
			return "Cat A";
		}else return "Mouse C";
    }

}
