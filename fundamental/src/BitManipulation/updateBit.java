import java.util.*;

public class updateBit {

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int bitMask = 1 << pos;

        if (oper == 1) {
            int newNo = bitMask | n;
            System.out.println(newNo);
        } else {
            int notbitMask = ~(bitMask);
            int newNo = notbitMask & n;
            System.out.println(newNo);
        }
    }

}
