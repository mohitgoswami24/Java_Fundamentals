package fundamental;
import java.util.Scanner;

public class Hello {
	 public static void main(String[] args) {
		 int i=1;
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 while(i<=n) {
			 int j=1;
			 while(j<=n) {
				 System.out.print("*");
				 j=j+1;
			 }
			 System.out.print("\n");
			 i=i+1;
			 
		 }
	 }}