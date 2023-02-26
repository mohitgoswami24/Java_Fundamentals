package fundamental;
import java.util.Scanner;

public class TrainglePattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        
        while (i <= n) {
            int j = 1;
            int p=i;
            while (j <= i) {
                System.out.print(p);
                p=p+1;
                j = j + 1;
            }
            System.out.print("\n");
            i = i + 1;
        }

    }

}
