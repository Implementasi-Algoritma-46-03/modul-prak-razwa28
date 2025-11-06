import java.util.Scanner;

/**
 * Program menghitung sisa zat radioaktif setelah N hari.
 */
public class Jurnal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r; // jumlah awal zat radioaktif
        int n;    // jumlah hari
        r = in.nextDouble();
        n = in.nextInt();
        
        int hari = 0;
        double sisa = r;
        
        // setiap 10 hari, zat berkurang setengah
        while (hari < n) {
            sisa /= 2;
            hari += 10;
        }

        System.out.printf("%.3f\n", sisa);
    }
}
