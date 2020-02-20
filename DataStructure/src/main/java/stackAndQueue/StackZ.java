package stackAndQueue;

import java.util.ArrayList;

public class StackZ<T> {
	
	private ArrayList<T> arr;
	private int size;
	private T bottom;
	private T top;
	
	public ArrayList<T> getArr() {
		return arr;
	}


	public void setArr(ArrayList<T> arr) {
		this.arr = arr;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public T getBottom() {
		return bottom;
	}


	public void setBottom(T bottom) {
		this.bottom = bottom;
	}


	public T getTop() {
		return top;
	}


	public void setTop(T top) {
		this.top = top;
	}


	public StackZ(ArrayList<T> arr) {
		this.arr = arr;
		this.size = arr.size();
		this.bottom = arr.get(0);
		this.top = arr.get(this.size - 1);
	}
	
	
	public void push(T item) {
		if(this.size == 0) {
			this.bottom = item;
		}
		if(this.size > 0) {
			this.top = item;
		}		
	}
	
	public T pop() {
		T item = null;
		if(this.size == 0) {
			item = null;			
		}
		if(this.size > 0) {
			item = this.top;
		}			
		return item;		
	}
		
}
	

