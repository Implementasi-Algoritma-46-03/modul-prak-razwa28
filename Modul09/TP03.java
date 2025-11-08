import java.util.*;

public class TP03 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        long hasil = 1;

        for(int i = 1; i <= n; i++){
            hasil = hasil * i;
        }
        System.out.println(hasil);
    }
}
