package stackAndQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class RezaStack<T> {

	ArrayList<T> arr = new ArrayList<T>();

	public T push(T item) {
		arr.add(item);
		return item;
	}

	public T pop() {
		if (arr.isEmpty())
			throw new EmptyStackException();
			   
		int size = arr.size();
		T item = arr.get(size - 1);
		arr.remove(size - 1);
		return item;
	}

	public boolean isEmpty() {
		return arr.size() == 0;
	}
}
