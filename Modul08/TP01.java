import java.util.*;

public class TP01 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int amoba = 30;
        int menit = 0;

        while (amoba < n) {
            amoba = amoba * 2;
            menit = menit + 15;
        }

        System.out.println(menit);
    }
}
