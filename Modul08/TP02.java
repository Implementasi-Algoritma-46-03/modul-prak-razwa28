import java.util.*;

public class TP02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int hasil = 0;

        while (n != 0) {
            int digit = n % 10;
            hasil = hasil * 10 + digit;
            n = n/10;
        }
        System.out.println(hasil);
    }
}
