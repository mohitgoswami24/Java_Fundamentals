package fundamental;

import java.util.Scanner;

public class pattern2 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            char p = 'A';
            while (j <= i) {
            	char p1 =(char)('A'+(n-i)+(j-1));
                System.out.print(p1);
                
                j = j + 1;
            }
            System.out.print("\n");
            i = i + 1;
        }

    }

}
