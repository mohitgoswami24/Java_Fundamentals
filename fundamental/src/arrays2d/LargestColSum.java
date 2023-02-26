package arrays2d;


import java.util.Scanner;

public class LargestColSum {
	
	
	public static int[][] TakeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		System.out.println("Enter no of cols");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element of "+ i +"th row "+ j +"th col ");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	public static int largestcol(int [][] arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		int largest=Integer.MIN_VALUE;
		for(int j=0;j<cols;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum=sum+arr[i][j];
			}
			if(sum>largest) {
				largest=sum;
			}
		}
		return largest;
	}
	

	public static void main(String [] args) {
		int [][] input=TakeInput();
		int largestSumCol= largestcol(input);
		System.out.println(largestSumCol);
		
	}
	

}
