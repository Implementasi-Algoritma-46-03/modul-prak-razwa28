import java.util.*;

public class TP03 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int total = 0;

         while(angka != 0) {
            total += angka;
            angka = in.nextInt();
        }
        System.out.println(total);
    }
}
