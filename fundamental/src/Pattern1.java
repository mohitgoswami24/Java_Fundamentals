//package Patterns;
//import java.util.Scanner;
//class Pattern1 {
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	while(j <= n) {
//	    		System.out.print("*");
//	    		j++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//    
//}
//
////output --> Pattern 1
////n = 4
////****
////****
////****
////****
//
//
////Pattern 2 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern2 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	while(j <= n) {
//	    		System.out.print(i);
//	    		j++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//
//}
//
////Output
//
////n = 4
//
////1111
////2222
////3333
////4444
//
//
////Pattern 3 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern3 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	while(j <= n) {
//	    		System.out.print(j);
//	    		j++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//
//}
//
////  Output
////
////  n = 4
////
////  1234
////  1234
////  1234
////  1234
//
//
////Pattern 4 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern4 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	while(j <= n) {
//	    		System.out.print(n+1-j);
//	    		j++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//}
//
////output
////
////n = 4
////
////4321
////4321
////4321
////4321
//
//
//
////Pattern 5 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern5 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	while(j <= i) {
//	    		System.out.print(j);
//	    		j++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//}
//
////Output
////
////n = 5
////
////1
////12
////123
////1234
////12345
//
////Pattern 6 ------------------------------
//
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern6 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	int num = i;
//	    	while(j <= i) {
//	    		
//	    		System.out.print(num);
//	    		j++;
//	    		num++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//}
//
////Output
////n = 4
////1
////23
////345
////4567
//
////Pattern 7 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern7 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    int num = 1;
//	    while( i <= n) {
//	    	int j = 1;
//	    	
//	    	while(j <= i) {
//	    		
//	    		System.out.print(num + " ");
//	    		j++;
//	    		num++;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//}
//
////output
//
////n = 4
//
////1 
////2 3 
////4 5 6 
////7 8 9 10 
//
////Pattern 8 ------------------------------
//
//package Patterns;
//
//import java.util.Scanner;
//
//public class pattern8 {
//public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int i = 1;
//	    
//	    while( i <= n) {
//	    	int j = 1;
//	    	int num = i;
//	    	while(j <= i) {
//	    		
//	    		System.out.print(num);
//	    		j++;
//	    		num--;
//	    	}
//	    	System.out.println();
//	    	i++;
//	    }
//	}
//}
//
////output
////
////n = 5
////
////1
////21
////321
////4321
////54321
//
