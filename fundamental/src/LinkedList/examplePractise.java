package LinkedList;
import java.util.Scanner;
public class examplePractise {
     public static void main(String [] args) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter first number:");
    	 int a = sc.nextInt();
    	 
    	 System.out.println("Enter Second number:");
    	 int b = sc.nextInt();
    	 
    	 System.out.println("Enter operator");
    	 sc.nextLine();
    	 char operator = sc.nextLine().charAt(0);
    	 
    	 int result = 0;
    	 switch(operator) {
    	 case '+':
    		 result = a + b;
    		 System.out.println("Result is: " + result);
    		 break;
    	 case '-':
    		 result = a - b;
    		 System.out.println("Result is: " + result);
    		 break;
    	 case '*':
    		 result = a * b;
    		 System.out.println("Result is: " + result);
    		 break;
    	 case '/':
    		 result = a / b;
    		 System.out.println("Result is: " + result);
    		 break;
    	default :
    		System.out.println("Wrong operator");
    	 }
     }
}
