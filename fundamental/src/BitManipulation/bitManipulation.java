import java.util.*;

public class bitManipulation {

    public static void main(String[] args) {
        int n = 5;
        int position = 3;
        int bitMask = 1 << position;
        if ((bitMask & n) == 0) {
            System.out.println("bit Was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}