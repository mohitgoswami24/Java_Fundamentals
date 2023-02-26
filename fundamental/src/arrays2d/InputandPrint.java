package arrays2d;

import java.util.Scanner;


public class InputandPrint {
	public static void main(String [] args) {
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
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}
	
}
