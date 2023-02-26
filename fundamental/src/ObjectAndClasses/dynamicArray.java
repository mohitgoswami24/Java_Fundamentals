package ObjectAndClasses;

public class dynamicArray {
	private int data[];
	private int nextElementIndex;
	
	public dynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	public int get(int i) {
		if( i >= nextElementIndex) {
			//Throw error
			return -1;
		}
		return data[i];
	}
	
	public void add(int ele) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex]=ele;
		nextElementIndex++;
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i < temp.length ; i++) {
			data[i]=temp[i];
		}
		
	}

	public void set(int i,int num) {
		if( i >= nextElementIndex) {
			return;
		}
		data[i] = num;
	}
	
	public int removeLast() {
		if(nextElementIndex==0) {
			return -1;
		}
		int temp = nextElementIndex;
		nextElementIndex--;
		return temp;
	}

}
