package stackAndQueue;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class RezaQueue<E> {
	
	LinkedList<E> list = new LinkedList<E>();
	
	public void enqueue(E item) {
		if(item != null) {
			list.add(item);
		}
		
	}
	
	public E dequeue() {
		if(list.isEmpty()) {
			throw new EmptyStackException();			
		}
		E first = list.getFirst();
		list.remove(first);
		return first;
		
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
		
	}
}
