package arraylist;

import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
    	ArrayList <Integer> arr = new ArrayList<>();
    	arr.add(10);
    	arr.add(20);
    	arr.add(30);
    	arr.add(1,50);
    	System.out.println(arr.size());
    	System.out.println(arr.get(1));
    	
    	//iteration of array
    	for(int i=0;i<arr.size(); i++) {
    		System.out.print(arr.get(i)+" ");
    	}
    	System.out.println();
    	
    	//Enhanced for loop - for each loop
    	for(int i:arr) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }
}
